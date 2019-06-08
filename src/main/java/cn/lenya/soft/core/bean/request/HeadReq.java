/* Copyright (c) 2019 白羊智慧区块网络技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.bean.request;

public class HeadReq {

	private String exchangeCode;
	private String clientId;
	private String clientType;
	private String packType;
	private String source;
	private String destination;

	/**
	 * @return the exchangeCode
	 */
	public String getExchangeCode() {
		return exchangeCode;
	}

	/**
	 * @param exchangeCode the exchangeCode to set
	 */
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientType
	 */
	public String getClientType() {
		return clientType;
	}

	/**
	 * @param clientType the clientType to set
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	/**
	 * @return the packType
	 */
	public String getPackType() {
		return packType;
	}

	/**
	 * @param packType the packType to set
	 */
	public void setPackType(String packType) {
		this.packType = packType;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
