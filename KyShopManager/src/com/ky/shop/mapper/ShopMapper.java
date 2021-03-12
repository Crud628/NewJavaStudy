package com.ky.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ky.shop.entity.Shop;

public interface ShopMapper {

	List<Shop> getShopList(@Param("id")String id, @Param("sname")String sname, @Param("phone")String phone,
							@Param("stype")String stype, @Param("distinct")String distinct, 
							@Param("adress")String address,@Param("payBegin")Integer payBegin, 
							@Param("payEnd")Integer payEnd);
	String getLast();
	
	Shop getShopById(String id);
	
	String addShop(Shop shop);
	
	int updateShop(Shop shop);
}
