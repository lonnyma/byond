/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.common.utils;

public class CommonUtil {
	public static void setNULL(Object...args){
		for(Object clazz:args){
			if(null!=clazz){
				clazz = null;
			}
		}
	}
}
