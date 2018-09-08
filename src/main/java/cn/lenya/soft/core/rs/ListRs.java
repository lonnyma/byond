/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.rs;

import java.util.List;

public class ListRs<T> extends BaseRs {

	private List<T> resultList=null;//计算结果列表
		
	
	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}



}
