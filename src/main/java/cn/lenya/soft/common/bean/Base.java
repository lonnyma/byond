/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.common.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cn.lenya.soft.common.utils.DateUtil;

/**
 * 作用：框架层基类，该类负责对象的封装
 * 
 * @author maql
 *
 */
public abstract class Base {

	/**
	 * 功能描述：对参数值进行判断，判断值否为空
	 * 
	 * @param args
	 */
	protected void init(Object... args) {
		for (Object clazz : args) {
			if (null == clazz || "".equals(clazz)) {
				throw new NullPointerException("there is some null parameter");
			}
		}
	}

	/**
	 * 功能描述：利用反射技术，对指定对象进行初始化
	 * 
	 * @param obj
	 * @param clzz
	 *            反射对象		
	 * @param orm
	 * @return
	 */
	protected <T> Object initBean(Map<String, Object> obj, Class<T> clzz, Map<String, Object> orm) {

		Object object = null;
		try {
			init(obj, clzz);
			object = clzz.newInstance();
			Set<String> st = new HashSet<String>();
			st = getAllFieldsName(st, clzz);
			if (null == orm || orm.size() == 0) {
				// 得到所有参数obj的键
				Set<String> keys = obj.keySet();
				for (String field : st) {
					if (keys.contains(field)) {
						setValueByPropName(object, field, obj.get(field));
					}
				}

			} else {
				for (String field : st) {
					if (obj.containsKey(orm.get(field))) {
						setValueByPropName(object, field, obj.get(orm.get(field)));
					}
				}
			}

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;

	}

	/**
	 * 功能描述： 将对象转换成map
	 * 
	 * @param obj
	 * @return
	 */
	protected  Map<String, Object> object2Map(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		Class<?> c;
		try {
			c = Class.forName(obj.getClass().getName());
			Method[] m = c.getMethods();
			for (int i = 0; i < m.length; i++) {
				String method = m[i].getName();
				if (method.startsWith("get")) {
					try {
						Object value = m[i].invoke(obj);
						if (value != null ) {
							String key = method.substring(3);
							key = key.substring(0, 1).toLowerCase().concat( key.substring(1));
							if(!"class".equals(key)) {
								map.put(key, value);
							}
						}
					} catch (Exception e) {
						System.out.println("error:" + method);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 功能描述：调用set方法给对象赋值
	 * 
	 * @param invokeObj
	 * @param propName
	 * @param obj
	 */
	private <T> void setValueByPropName(Object invokeObj, String propName, Object obj) {
		try {
			// 获得此参数的引用类型CLASS
			Class<?> clazz = getParameterTypes(invokeObj.getClass(), propName);
			// 反射继承了本类的某个实体中某个属性set方法 一个参数是setXxx的方法名，一个参数是传入此方法的参数类型CLASS
			Method method = getDeclaredMethod(invokeObj.getClass(), getSetterMethodName(propName), clazz);
			Constructor<?> con = null;
			if (clazz.isAssignableFrom(String.class)) {
				// 取得传入参数类型根据字符串实例化的构造函数
				// con = clazz.getDeclaredConstructor(String.class);
				// 加入传入的是空,则传入空,否则传入实例化了的值
				method.invoke(invokeObj, obj == null ? "" : obj);
				return;
			} else if (clazz.isAssignableFrom(Date.class)) {
				method.invoke(invokeObj, DateUtil.toJavaUtilDate(obj == null ? "" : obj.toString()));
				return;
			} else if (clazz.isAssignableFrom(Timestamp.class)) {
				method.invoke(invokeObj,
						new Timestamp(DateUtil.toJavaUtilDate(obj == null ? "" : obj.toString()).getTime()));
				return;
			} else if (clazz.isAssignableFrom(Long.class)) {
				method.invoke(invokeObj, new Long(obj == null ? "0" : obj.toString()));
				return;
			} else if (clazz.isAssignableFrom(Integer.class)) {
				method.invoke(invokeObj, new Integer(obj == null ? "0" : obj.toString()));
				return;
			} else if (clazz.isAssignableFrom(Double.class)) {
				method.invoke(invokeObj, new Double(obj == null ? "0.00" : obj.toString()));
				return;
			} else if (clazz.isAssignableFrom(Float.class)) {
				method.invoke(invokeObj, new Float(obj == null ? "0.0" : obj.toString()));
				return;
			} else {
				try {
					// 取得传入参数类型根据字符串实例化的构造函数
					con = clazz.getDeclaredConstructor(String.class);
				} catch (NoSuchMethodException e) {
					con = null;
				}
				if (con != null) {
					method.invoke(invokeObj, obj == null ? "" : con.newInstance(obj.toString()));
				} else {
					method.invoke(invokeObj, obj == null ? null : obj);
				}
				return;
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 功能描述：得到set方法名
	 * 
	 * @param propName
	 * @return
	 */
	private String getSetterMethodName(String propName) {
		return "set" + propName.substring(0, 1).toUpperCase() + propName.substring(1);
	}

	/**
	 * 功能描述：得到get方法名
	 * 
	 * @param propName
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getGetterMethodName(String propName) {
		return "get" + propName.substring(0, 1).toUpperCase() + propName.substring(1);
	}

	<T> Class<?> getParameterTypes(Class<T> object, String propName) {
		Class<?> clazz = null;
		try {
			clazz = getAllFields(new HashMap<String, Field>(), object).get(propName).getType();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return clazz;
	}

	/**
	 * 功能描述：得到当前类所有方法，包括所有父类方法
	 * 
	 * @param object
	 * @param methodName
	 * @param parameterTypes
	 * @return
	 */
	private Method getDeclaredMethod(Class<?> object, String methodName, Class<?>... parameterTypes) {
		Method method = null;
		for (Class<?> clazz = object; clazz != Object.class; clazz = clazz.getSuperclass()) {
			try {
				method = clazz.getDeclaredMethod(methodName, parameterTypes);
				return method;
			} catch (Exception e) {
			}
		}
		return null;
	}

	/**
	 * 功能描述：得到当前类所有字段属性，包括所有父类字段
	 * 
	 * @param flist
	 * @param clss
	 * @return
	 */
	protected static <T> Map<String, Field> getAllFields(Map<String, Field> flist, Class<T> clss) {
		if (null == clss)
			return null;
		Class<?> claa = clss.getSuperclass();
		if (null != claa) {
			getAllFields(flist, claa);
			Field[] fields = clss.getDeclaredFields();
			for (Field field : fields) {
				flist.put(field.getName(), field);
			}
		}
		return flist;
	}

	/**
	 * 功能描述：得到当前类所有字段属性名，包括所有父类字段
	 * 
	 * @param flist
	 * @param clss
	 * @return
	 */
	private static <T> Set<String> getAllFieldsName(Set<String> flist, Class<T> clss) {
		if (null == clss)
			return null;
		Class<?> claa = clss.getSuperclass();
		if (null != claa) {
			getAllFieldsName(flist, claa);
			Field[] fields = clss.getDeclaredFields();
			for (Field field : fields) {
				flist.add(field.getName());
			}
		}
		return flist;
	}

}
