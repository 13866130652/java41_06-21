package homeWork3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 3)、编写一个日期工具类：DateUtil类 (10分)
 * 3.1)、将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，如果转换失败，则抛出异常。 方法原型：public static Date
 * convertToDate(String date) throws Exception{}
 * 3.2)、将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。 方法原型：public static String
 * convertToDateString(Date date){ } 3.3)、编写测试类Test,对以上两个方法进行测试。
 */
public class DateUtil {
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");// 创建对象,此类是
		Date d = formater.parse(date);
		return d;
	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		return formater.format(date);
	}
}
