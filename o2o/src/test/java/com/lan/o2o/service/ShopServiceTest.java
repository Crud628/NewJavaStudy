package com.lan.o2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lan.o2o.BaseTest;
import com.lan.o2o.dto.ShopExecution;
import com.lan.o2o.entity.Area;
import com.lan.o2o.entity.PersonInfo;
import com.lan.o2o.entity.Shop;
import com.lan.o2o.entity.ShopCategory;
import com.lan.o2o.enums.ShopStateEnum;

public class ShopServiceTest extends BaseTest{
	@Autowired
	private ShopService shopService;
	
	@Test
	@Ignore
	public void testAddShop() throws FileNotFoundException {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试的店铺4");
		shop.setShopDesc("test4");
		shop.setShopAddr("test4");
		shop.setPhone("test4");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		File shopImg = new File("E:\\BaiduNetdiskDownload\\hhh.jpg");
		InputStream is = new FileInputStream(shopImg);
		ShopExecution se  = shopService.addShop(shop, is ,shopImg.getName());
		assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
	}
	
	@Test
	public void testmodifyShop() throws FileNotFoundException,FileNotFoundException{
		Shop shop = new Shop();
		shop.setShopId(1L);
		shop.setShopName("修改后的店铺名称");
		File shopImg = new File("E:\\BaiduNetdiskDownload\\aaa.png");
		InputStream is = new FileInputStream(shopImg);
		ShopExecution shopExecution = shopService.modifyShop(shop, is, "aaa.jpg");
		System.out.println(shopExecution.getShop().getShopImg());
	}
}
