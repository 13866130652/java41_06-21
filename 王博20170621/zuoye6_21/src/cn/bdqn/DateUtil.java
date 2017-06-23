package cn.bdqn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//日期类
public class DateUtil {
	// 1.将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，
	// 如果转换失败，则抛出异常。
	public static Date convertToDate(String d) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(d);
		return date;

	}

	// 2.将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		return format.format(date);

	}
}
