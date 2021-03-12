package com.ky.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ky.shop.entity.Shop;
import com.ky.shop.mapper.ShopMapper;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopMapper shopMapper;
	
	@Override
	public PageInfo<Shop> getShopList(String id, String sname, String phone, String stype, String distinct,
			String address, Integer payBegin, Integer payEnd, Integer pageNum) {
		// TODO Auto-generated method stub
		if(payBegin == null) {
			payBegin = 0;
		}
		if(payEnd == null) {
			payEnd = 99999;
		}
		PageHelper.startPage(pageNum,5);
		List<Shop> list = shopMapper.getShopList(id, sname, phone, stype, distinct, address, payBegin, payEnd);
		PageInfo<Shop> pageinfo = new PageInfo<Shop>(list);
		return pageinfo;
	}

	@Override
	public Shop getShopById(String id) {
		// TODO Auto-generated method stub
		return shopMapper.getShopById(id);
	}

	@Override
	public String newShopId() {
		// TODO Auto-generated method stub
		return shopMapper.getLast();
	}

	@Override
	public String addShop(Shop shop) {
		// TODO Auto-generated method stub
		return shopMapper.addShop(shop);
	}

	@Override
	public boolean updateShop(Shop shop) {
		// TODO Auto-generated method stub
		int flag = shopMapper.updateShop(shop);
		if(flag >= 1) {
			return true;
		}
		return false;
	}
	
	

}
