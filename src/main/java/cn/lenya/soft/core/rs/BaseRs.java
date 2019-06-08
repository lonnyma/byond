/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.rs;

/**
 * 作用：用于数据库结果集接收
 * 
 * @author lenya
 * @version v1.0 Date : 2014-12-12
 *
 */

public class BaseRs {
	private Integer rsCount = null;// 定义结果记录条数
	private String rsMsg = null;// 定义反回结果消息提示
	private Boolean result = null;// 定义查询结果是否成功
	private Integer count = null;// 辅助记录总数
	private String rsLevel = null;// 定义结果等级
	private String rsCode = null;
	private String rsSql = null; // 获取结果的sql语句

	public Integer getRsCount() {
		return rsCount;
	}

	public void setRsCount(Integer rsCount) {
		this.rsCount = rsCount;
	}

	public String getRsMsg() {
		return rsMsg;
	}

	public void setRsMsg(String rsMsg) {
		this.rsMsg = rsMsg;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getRsLevel() {
		return rsLevel;
	}

	public void setRsLevel(String rsLevel) {
		this.rsLevel = rsLevel;
	}

	public String getRsCode() {
		return rsCode;
	}

	public void setRsCode(String rsCode) {
		this.rsCode = rsCode;
	}

	public String getRsSql() {
		return rsSql;
	}

	public void setRsSql(String rsSql) {
		this.rsSql = rsSql;
	}

}
