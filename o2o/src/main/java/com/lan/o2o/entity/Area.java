package com.lan.o2o.entity;

import java.util.Date;


/**
 * 区域实体类
 * 表：tb_area
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年2月28日下午4:05:42
 */
public class Area {
	/**
	 * ID
	 */
	private Integer areaId;
	
	/**
	 * 名称
	 */
	private String areaName;
	
	/**
	 * 权重：  显示顺序
	 */
	private Integer priority;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 最后更新时间
	 */
	private Date lastEditTime;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
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
	
	
}
