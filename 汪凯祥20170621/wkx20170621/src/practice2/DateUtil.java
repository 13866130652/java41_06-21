package practice2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，如果转换失败，则抛出异常。
 * 
 * 方法原型：public static Date convertToDate(String date) throws Exception{}
 * 
 * 将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
 * 
 * 方法原型：public static String convertToDateString(Date date){ }
 *
 */
public class DateUtil {
	// 将字符串日期转换为日期类型
	public static Date convertToDate(String date) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = df.parse(date);
		return d;
	}

	// 将日期类型转换为字符串类型
	public static String convertToDateString(Date date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String st = df.format(date);
		return st;
	}
}
