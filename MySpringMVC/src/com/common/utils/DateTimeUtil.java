package com.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	private static SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * 获取当前日期时间 
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String getCurrentDateTime() {
		return datetime.format(new Date());
	}
	
	/**
	 * 获取当前日期
	 * @return yyyy-MM-dd
	 */
	public static String getCurrentDate() {
		return date.format(new Date());
	}
	
	/**
	 * 获取当前时间 
	 * @return HH:mm:ss
	 */
	public static String getCurrentTime() {
		return time.format(new Date());
	}
	
}
