package com.lan.o2o.entity;

import java.util.Date;
/**
 * 商家分类
 * 表：tb_shop_category
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年2月28日下午8:21:00
 */
public class ShopCategory {
	
	/**
	 * 类别ID
	 */
	private Long shopCategoryId;
	
	/**
	 * 类别名
	 */
	private String shopCategoryName;
	
	/**
	 * 类描述
	 */
	private String shopCategoryDesc;
	
	/**
	 * 类别图片路径
	 */
	private String shopCategoryImg;
	
	/**
	 * 类别权重
	 */
	private Integer priority;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 修改时间
	 */
	private Date lastEditTime;
	
	/**
	 * 上级分类
	 */
	private ShopCategory parent;

	public Long getShopCategoryId() {
		return shopCategoryId;
	}

	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}

	public String getShopCategoryName() {
		return shopCategoryName;
	}

	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}

	public String getShopCategoryDesc() {
		return shopCategoryDesc;
	}

	public void setShopCategoryDesc(String shopCategoryDesc) {
		this.shopCategoryDesc = shopCategoryDesc;
	}

	public String getShopCategoryImg() {
		return shopCategoryImg;
	}

	public void setShopCategoryImg(String shopCategoryImg) {
		this.shopCategoryImg = shopCategoryImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public ShopCategory getParent() {
		return parent;
	}

	public void setParent(ShopCategory parent) {
		this.parent = parent;
	}
	
	
	
	
	
}
