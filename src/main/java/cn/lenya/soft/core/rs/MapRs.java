/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.core.rs;

import java.util.Map;


public class MapRs<T> extends BaseRs {
	private Map<String,T> map = null;

	public Map<String, T> getMap() {
		return map;
	}

	public void setMap(Map<String, T> map) {
		this.map = map;
	}

	

	
	
}
