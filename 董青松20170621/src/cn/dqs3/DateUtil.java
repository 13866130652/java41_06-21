package cn.dqs3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  3.1)、将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，如果转换失败，则抛出异常。
 方法原型：public static Date convertToDate(String date) throws Exception{}
   3.2)、将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
方法原型：public static String convertToDateString(Date date){ }
   3.3)、编写测试类Test,对以上两个方法进行测试。
 */
public class DateUtil {

	// 将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，如果转换失败，则抛出异常
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date data = format.parse(date);
		System.out.println(data);
		return data;
	}

	// 将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String data = format.format(date);
		System.out.println(data);
		return data;
	}

}
