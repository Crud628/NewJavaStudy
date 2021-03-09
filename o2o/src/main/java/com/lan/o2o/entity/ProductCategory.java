package com.lan.o2o.entity;

import java.util.Date;

/**
 * 商品类别
 * 表：tb_product_category
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年2月28日下午8:43:24
 */
public class ProductCategory {
	
	/**
	 * 商品分类ID
	 */
	private Long productCategoryId;
	
	/**
	 * 店铺ID
	 */
	private Long shopId;
	
	/**
	 * 商品类别名称
	 */
	private String productCategoryName;
	
	/**
	 * 权重
	 */
	private Integer priority;
	
	/**
	 * 创建时间
	 */
	private Date createTime;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
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
	
}
