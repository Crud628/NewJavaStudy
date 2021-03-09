package com.lan.o2o.web.shopadmin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lan.o2o.dto.ShopExecution;
import com.lan.o2o.entity.Area;
import com.lan.o2o.entity.PersonInfo;
import com.lan.o2o.entity.Shop;
import com.lan.o2o.entity.ShopCategory;
import com.lan.o2o.enums.ShopStateEnum;
import com.lan.o2o.exceptions.ShopOperationException;
import com.lan.o2o.service.AreaService;
import com.lan.o2o.service.ShopCategoryService;
import com.lan.o2o.service.ShopService;
import com.lan.o2o.util.CodeUtil;
import com.lan.o2o.util.HttpServletRequestUtil;
@Controller
@RequestMapping("/shopadmin")
public class ShopManagementController {
	
	@Autowired
	private ShopService shopService;
	@Autowired
	private ShopCategoryService shopCategoryService;
	@Autowired
	private AreaService areaService;
	
	
	@RequestMapping(value = "/getshopinitinfo", method = RequestMethod.GET)
	@ResponseBody
	private Map<String,Object> getShopInitInfo(){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		List<ShopCategory> shopCategoryList = new ArrayList<ShopCategory>();
		List<Area> areaList = new ArrayList<Area>();
		try {
			shopCategoryList = shopCategoryService.getShopCategoryList(new ShopCategory());
			areaList = areaService.getAreaList();
			modelMap.put("shopCategoryList", shopCategoryList);
			modelMap.put("areaList", areaList);
			modelMap.put("success", true);
		}catch(Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}
	
	
	@RequestMapping(value = "/getshopbyid", method = RequestMethod.GET)
	@ResponseBody
	private Map<String,Object> getShopById(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		Long shopId = HttpServletRequestUtil.getLong(request, "shopId");
		if(shopId > -1) {
			try {
			Shop shop = shopService.getShopById(shopId);
			List<Area> areaList = areaService.getAreaList();
			modelMap.put("shop",shop);
			modelMap.put("area", areaList);
			modelMap.put("success", true);
			}catch(Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());
			}
		}else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "empty shopId");
		}
		return modelMap;
	}
	
	
	
	@RequestMapping(value = "/registershop",method = RequestMethod.POST)
	@ResponseBody
	private Map<String,Object> registerShop(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		if(!CodeUtil.checkVerifyCode(request)) {
			modelMap.put("success", false);
			modelMap.put("errMag", "输入了错误的验证码");
			return modelMap;
		}
		//1.接受并转化相应参数，包括店铺信息以及图片信息
		String shopStr =  HttpServletRequestUtil.getString(request, "shopStr");
		ObjectMapper mapper = new ObjectMapper();
		Shop shop = null;
		try {
			//json转对象
			shop = mapper.readValue(shopStr, Shop.class);
		}catch(Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMag", e.getMessage());
			return modelMap;
		}
		CommonsMultipartFile shopImg = null;
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if(commonsMultipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
			shopImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("shopImg");
		}else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "上传图片不能为空");
			return modelMap;
		}
		//2.注册店铺
		if(shop != null && shopImg != null) {
			PersonInfo owner = (PersonInfo)request.getSession().getAttribute("user");
			shop.setOwner(owner);
			ShopExecution se;
			try {
				se = shopService.addShop(shop, shopImg.getInputStream(),shopImg.getOriginalFilename());
				if(se.getState() == ShopStateEnum.CHECK.getState()) {
					modelMap.put("success", true);
					//该用户可以操作的用户列表
					@SuppressWarnings("unchecked")//消除警告信息
					List<Shop> shopList = (List<Shop>)request.getSession().getAttribute("shopList");
					if(shopList == null || shopList.size() == 0) {
						shopList = new ArrayList<Shop>();
					}
					shopList.add(se.getShop());
					request.getSession().setAttribute("shopList", shopList);
				}else {
					modelMap.put("success", false);
					modelMap.put("errMsg", se.getStateInfo());
				}
			}catch(ShopOperationException e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());
			}catch (IOException e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());
			}
			return modelMap;
		}else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "请输入店铺信息");
			return modelMap;
		}
	}
	
	@RequestMapping(value = "/modifyshop",method = RequestMethod.POST)
	@ResponseBody
	private Map<String,Object> modifyShop(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		if(!CodeUtil.checkVerifyCode(request)) {
			modelMap.put("success", false);
			modelMap.put("errMag", "输入了错误的验证码");
			return modelMap;
		}
		//1.接受并转化相应参数，包括店铺信息以及图片信息
		String shopStr =  HttpServletRequestUtil.getString(request, "shopStr");
		ObjectMapper mapper = new ObjectMapper();
		Shop shop = null;
		try {
			//json转对象
			shop = mapper.readValue(shopStr, Shop.class);
		}catch(Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMag", e.getMessage());
			return modelMap;
		}
		CommonsMultipartFile shopImg = null;
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if(commonsMultipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
			shopImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("shopImg");
		}
		//2.修改店铺信息
		if(shop != null && shop.getShopId()!=null) {
			ShopExecution se;
			try {
				if(shopImg == null) {
					se = shopService.modifyShop(shop, null,null);
				}else {
					se = shopService.modifyShop(shop, shopImg.getInputStream(),shopImg.getOriginalFilename());
				}
				if(se.getState() == ShopStateEnum.SUCCESS.getState()) {
					modelMap.put("success", true);
				}else {
					modelMap.put("success", false);
					modelMap.put("errMsg", se.getStateInfo());
				}
			}catch(ShopOperationException e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());
			}catch (IOException e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());
			}
			return modelMap;
		}else {
			modelMap.put("success", false);
			modelMap.put("errMsg", "请输入店铺ID");
			return modelMap;
		}
	}
	
}
