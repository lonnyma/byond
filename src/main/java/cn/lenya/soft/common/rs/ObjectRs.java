/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.common.rs;

public class ObjectRs<T> extends BaseRs {
	private T object = null;
	
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}

}
