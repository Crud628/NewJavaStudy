package com.lan.o2o.dao;

import com.lan.o2o.entity.Shop;

public interface ShopDao {
	/**
	 * 新增店铺
	 * @param shop
	 * @return 1:成功  -1：失败
	 */
	int insertShop(Shop shop);
	
	/**
	 * 更新店铺信息
	 * @param shop
	 * @return
	 */
	int updateShop(Shop shop);
	
	/**
	 * 通过shop id查询店铺
	 * @param shopId
	 * @return
	 */
	Shop queryByShopId(long shopId);
}
