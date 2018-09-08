/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.bean;

public class PageBean {

	//定义每页条数
	private Integer pageSize=null;
	//当前页面id（页号）
	private Integer pageNow=null;
	//页面数(多少页)
	private Integer pageCount=null;
	//页面分开点
	private Integer pageSub=null;	
	//对象在数据库中的总记录数	
	private Integer contentCount=null;
	public PageBean(){
		
	}
	
	public PageBean(Integer pageSize,Integer pageNow,Integer pageCount,Integer pageSub,Integer contentCount){
		
		this.pageSize=pageSize;
		this.pageNow=pageNow;
		this.pageCount=pageCount;
		this.pageSub=pageSub;
		this.contentCount=contentCount;
	}
	
	
	
	
	public Integer getContentCount() {
		return contentCount;
	}

	public void setContentCount(Integer contentCount) {
		this.contentCount = contentCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSub() {
		return pageSub;
	}
	public void setPageSub(Integer pageSub) {
		this.pageSub = pageSub;
	}
	
	
}
