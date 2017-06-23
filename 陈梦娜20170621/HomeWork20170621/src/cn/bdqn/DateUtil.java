package cn.bdqn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//日期工具类DateUtil
public class DateUtil {
	// 字符串转换成日期类
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d = format.parse(date);
		return d;
	}

	// 日期类型转换成字符串
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String st = format.format(date);
		return st;
	}
}
