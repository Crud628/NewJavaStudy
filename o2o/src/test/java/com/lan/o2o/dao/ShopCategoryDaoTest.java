package com.lan.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lan.o2o.BaseTest;
import com.lan.o2o.entity.ShopCategory;

public class ShopCategoryDaoTest extends BaseTest{
	@Autowired
	private ShopCategoryDao shopCategoryDao;
	
	@Test
	public void testQueryShopCategory() {
		List<ShopCategory> list = shopCategoryDao.queryShopCategory(new ShopCategory());
		assertEquals(2, list.size());
		ShopCategory testCategory = new ShopCategory();
		ShopCategory parentCategory = new ShopCategory();
		parentCategory.setShopCategoryId(1L);
		testCategory.setParent(parentCategory);
		list = shopCategoryDao.queryShopCategory(testCategory);
		assertEquals(1, list.size());
		System.out.println(list.get(0).getShopCategoryName());
	}
}
