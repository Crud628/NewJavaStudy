package com.ky.shop.entity;

import java.util.Date;

public class Shop {
	private String id;
	private String name;
	private String tel;
	private String type;
	private String district;
	private String adress;
	private Integer per;
	private String del_flag;
	private Date create_time;
	private Date update_time;
	private String comments;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(String id, String name, String tel, String type, String district, String adress, Integer per,
			String del_flag, Date create_time, Date update_time, String comments) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.type = type;
		this.district = district;
		this.adress = adress;
		this.per = per;
		this.del_flag = del_flag;
		this.create_time = create_time;
		this.update_time = update_time;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", tel=" + tel + ", type=" + type + ", district=" + district
				+ ", adress=" + adress + ", per=" + per + ", del_flag=" + del_flag + ", create_time=" + create_time
				+ ", update_time=" + update_time + ", comments=" + comments + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Integer getPer() {
		return per;
	}
	public void setPer(Integer per) {
		this.per = per;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
