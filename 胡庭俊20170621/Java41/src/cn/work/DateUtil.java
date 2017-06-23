package cn.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//日期工具类
public class DateUtil {
	//将字符串转化为date类型
	public static Date converToDate(String st) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date=format.parse(st);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	//将date类型转化为字符串
	public static String converToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
}
