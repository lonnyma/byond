package cn.lenya.soft.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	/**
	 * 功能描述：格式化日期
	 * @param date
	 * @param dateFormat 日期格式
	 * @return  
	 */
	public static String dateForFormat(Date date,String dateFormat){
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		
		return sdf.format(date);
	}		
	
	public static String dateForFormat(String longDate,String dateFormat){
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);			
		return sdf.format(long2Date(longDate));			
	}
	
	
	/**
	 * 功能描述：将Long [new Date().getTime()]型转换成日期
	 * @param longDate
	 * @return
	 */
	public static Date long2Date(String longDate){
		return new Date(Long.valueOf(longDate));
	
	}
	
	

		
		/**
		 * 功能描述：格式化日期
		 * @param date
		 * @param dateFormat
		 * @return  
		 */
		public static String getSysDate(Date date,String dateFormat){
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			
			return sdf.format(date);
		}
		
		
	/**
	 * 功能描述：字符串转换成日期
	 * @param date String  日期字符串
	 * @return  java.util.Date 类型
	 */
		public static Date stringToJavaUtilDate(String date){
			if(null==date||"".equals(date))return null;
			Date mydate=null;
	         try {
	        	 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd") ;
				  mydate=sdf.parse(date);
			} catch (ParseException e) {
					e.printStackTrace();
			}
	         return mydate;
	}	
		
		/**
		 * 功能描述：字符串转换成日期
		 * @param date String  日期字符串
		 * @return  java.sql.Date 类型
		 */
		public final static  java.sql.Date stringToJavaSqlDate(String date){
			if(null==date)return null;
			Date sqlDate= stringToJavaUtilDate(date);
			return new java.sql.Date(sqlDate.getTime());
		}
		
		
		/**
		 * 功能描述
		 * @param date1 eg:"Wed Jul 9 00:00:00 GMT+0800 2014"
		 * @return  Date ʽ(yyyy-mm-dd)
		 * @throws ParseException
		 */
		public static String toTransFormatDate(Date date1 ) throws ParseException {
			SimpleDateFormat sf = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss z",Locale.ENGLISH);
			return new java.sql.Date(sf.parse(date1.toString()).getTime()).toString();
		}
		
		
		
		/**
		 * 功能描述：
		 * @param date eg:"Fri Jul 25 10:56:01 CST 2014"
		 * @return Date 2014-07-25ʽ(yyyy-mm-dd)
		 */
		public static String toTransFormatDate2(Date date){
				return new java.sql.Date(date.getTime()).toString();
			}
		
		public static String getDateCN() {
			SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
			String date = format.format(new Date(System.currentTimeMillis()));
			return date;// 2012年10月03日 23:41:31
		}

		public static String getDateEN() {
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date1 = format1.format(new Date(System.currentTimeMillis()));
			return date1;// 2012-10-03 23:41:31
		}

		public static String getDate() {
			SimpleDateFormat format = new SimpleDateFormat("HH:mm");
			String date = format.format(new Date(System.currentTimeMillis()));
			return date;
		}
}

