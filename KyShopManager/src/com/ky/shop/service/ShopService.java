package com.ky.shop.service;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.ky.shop.entity.Shop;

@Service
public interface ShopService {
	
	/**
	 * 分页店铺列表
	 * @param id
	 * @param sname
	 * @param phone
	 * @param stype
	 * @param distinct
	 * @param address
	 * @param payBegin
	 * @param payEnd
	 * @param pageNum
	 * @return
	 */
	PageInfo<Shop> getShopList(String id, String sname, String phone, String stype, String distinct, String address,
			Integer payBegin, Integer payEnd, Integer pageNum);

	Shop getShopById(String id);

	String newShopId();

	String addShop(Shop shop);

	boolean updateShop(Shop shop);
	
}
