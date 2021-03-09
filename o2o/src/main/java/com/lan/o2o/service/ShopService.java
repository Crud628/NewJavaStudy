package com.lan.o2o.service;

import java.io.InputStream;

import com.lan.o2o.dto.ShopExecution;
import com.lan.o2o.entity.Shop;
import com.lan.o2o.exceptions.ShopOperationException;

public interface ShopService {
	/**
	 * 店铺注册
	 * @param shop 
	 * @param shopImg
	 * @param fileName
	 * @return
	 */
	ShopExecution addShop(Shop shop,InputStream shopImgInputStream,String fileName) throws ShopOperationException;
	
	/**
	 * 通过店铺Id获取店铺信息
	 * @param shopId
	 * @return
	 */
	Shop getShopById(long shopId);
	
	
	/**
	 * 更新店铺信息，包括图片处理
	 * @param shop
	 * @param shopImgInputStream
	 * @param fileName
	 * @return
	 * @throws ShopOperationException
	 */
	ShopExecution modifyShop(Shop shop,InputStream shopImgInputStream,String fileName)throws ShopOperationException;
}
