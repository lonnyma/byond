package cn.lenya.soft.common.utils;

import java.io.InputStream;

public class ClassUtil {

	
	public InputStream loadResource(String name) {
	        InputStream in = getClass().getResourceAsStream(name);
	        if (in == null) {
	            in = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
	            if (in == null) {
	                in = getClass().getClassLoader().getResourceAsStream(name);
	            }
	        }
	        return in;
	    }
}
