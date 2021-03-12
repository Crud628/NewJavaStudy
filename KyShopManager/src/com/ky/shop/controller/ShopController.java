package com.ky.shop.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.ky.shop.entity.Shop;
import com.ky.shop.service.ShopService;

@Controller
public class ShopController {
	@Autowired
	private ShopService shopService;
	
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMdd");
	
	@RequestMapping("/getshoplist")
	@ResponseBody
	private PageInfo<Shop> getShopList(@RequestParam("id")String id,
			@RequestParam("name")String sname,
			@RequestParam("tel")String phone,
			@RequestParam("type")String stype,
			@RequestParam("distinct")String distinct,
			@RequestParam("address")String address,
			@RequestParam("payBegin")Integer payBegin,
			@RequestParam("payEnd")Integer payEnd,
			@RequestParam("pageNum")Integer pageNum){
		PageInfo<Shop> page = shopService.getShopList(id,sname,phone,stype,distinct,address,payBegin,payEnd,pageNum);
		return page;
	}
	
	@RequestMapping("/updateshop")
	@ResponseBody
	private Map<String,Object> updateShop(Shop shop){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		shop.setUpdate_time(new Date());
		boolean flag = shopService.updateShop(shop);
		if(flag) {
			modelMap.put("success", true);
		}else {
			modelMap.put("success", false);
		}
		return modelMap;
	}
	
	@RequestMapping("/addshop")
	@ResponseBody
	private Map<String,Object> addShop(Shop shop){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		shop.setCreate_time(new Date());
		shop.setUpdate_time(new Date());
		shop.setComments("审核中");
		String id = shopService.addShop(shop);
		if(id !=null ) {
			modelMap.put("success", true);
			modelMap.put("redirect", "query.html");
		}else {
			modelMap.put("success", false);
		}
		return modelMap;
	}
	
	@RequestMapping("/getShopbyid")
	@ResponseBody
	private Map<String,Object> getShopById(String id){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		Shop shop = shopService.getShopById(id);
		if(shop!=null) {
			modelMap.put("success", true);
			modelMap.put("shop", shop);
		}else {
			modelMap.put("success", false);
		}
		return modelMap;
	}
	
	@RequestMapping("/newShopid")
	@ResponseBody
	private Map<String,Object> newShopId(String id){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		String shopId = shopService.newShopId();
		String nowTimeStr = sDateFormat.format(new Date());
		if(nowTimeStr.equals(shopId.substring(0,6))) {
			
		}else {
			
		}
		if(shopId != null) {
			modelMap.put("success", true);
			modelMap.put("shopId", shopId);
		}else {
			modelMap.put("success", false);
		}
		return modelMap;
	}
}
