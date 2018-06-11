package com.ht.model;

public class Page {
	private Integer countData; // 总数据条数
	private Integer countPage; // 总页数
	private Integer pageSize = 3; // 每页显示条数
	private Integer currentPage = 1; // 当前页

	public Integer getCountData() {
		return countData;
	}

	public void setCountData(Integer countData) {
		this.countData = countData;
	}

	public Integer getCountPage() {
		return countPage;
	}

	public void setCountPage(Integer countPage) {
		this.countPage = countPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String toString() {
		return "Page [countData=" + countData + ", countPage=" + countPage + ", pageSize=" + pageSize + ", currentPage="
				+ currentPage + "]";
	}

}
