/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.common.rs;

/**
 * 作用：用于接口返回基类
 * @author burgeen
 *
 */
public class BaseResponse {

	private String rsMsg;
	private String rsCode;
	/**
	 * @return the rsMsg
	 */
	public String getRsMsg() {
		return rsMsg;
	}
	/**
	 * @param rsMsg the rsMsg to set
	 */
	public void setRsMsg(String rsMsg) {
		this.rsMsg = rsMsg;
	}
	/**
	 * @return the rsCode
	 */
	public String getRsCode() {
		return rsCode;
	}
	/**
	 * @param rsCode the rsCode to set
	 */
	public void setRsCode(String rsCode) {
		this.rsCode = rsCode;
	}
	
	
}
