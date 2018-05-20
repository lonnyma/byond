package cn.lenya.soft.common.rs;

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
