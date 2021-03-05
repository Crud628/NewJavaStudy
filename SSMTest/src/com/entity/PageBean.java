package com.entity;

import java.util.List;

public class PageBean<T> {
	private List<T> list; // 当前页数据
	private int currentPage; // 当前页
	private int rows; // 每页数据条数
	private int totalPage; // 总页数
	private int totalRows; // 总数据条数
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageBean(List<T> list, int currentPage, int rows, int totalPage, int totalRows) {
		super();
		this.list = list;
		this.currentPage = currentPage;
		this.rows = rows;
		this.totalPage = totalPage;
		this.totalRows = totalRows;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	
}
