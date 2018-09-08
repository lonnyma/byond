/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.bean;

import java.io.Serializable;


public  class BaseUserBean extends Base implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String aliasname;
	private String IDcardno;	
	private String language;	
	private String city;
	private String province;	
	private String country;
	private String headimgurl;
		

	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getHeadimgurl() {
		return headimgurl;
	}


	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAliasname() {
		return aliasname;
	}


	public void setAliasname(String aliasname) {
		this.aliasname = aliasname;
	}


	public String getIDcardno() {
		return IDcardno;
	}


	public void setIDcardno(String iDcardno) {
		IDcardno = iDcardno;
	}


	}
