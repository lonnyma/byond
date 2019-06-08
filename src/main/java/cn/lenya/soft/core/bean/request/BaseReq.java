/* Copyright (c) 2019 白羊智慧区块网络技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.bean.request;

/**
 * 作用：
 * 
 * @author Alpaca
 * @since 2019年2月5日
 */
public class BaseReq {
	private String operateType;
	private String token;
	private HeadReq header;

	/**
	 * @return the operateType
	 */
	public String getOperateType() {
		return operateType;
	}

	/**
	 * @param operateType the operateType to set
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the header
	 */
	public HeadReq getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(HeadReq header) {
		this.header = header;
	}

}
