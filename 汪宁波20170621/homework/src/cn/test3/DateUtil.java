package cn.test3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtil {
	// 1.字符串转换成日期方法
	public static Date convertToDate(String date) {
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd");// 创建日期格式对象
		Date d1 = null;
		try {
			d1 = d.parse(date);// 将字符串转换成日期格式
			return d1;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 2.将日期转换为字符串方法
	public static String convertToDateString(Date date) {
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd");// 创建日期格式对象
		String s = "";
		s = d.format(date);// 调用format()方法将日期转换成字符串类型
		return s;
	}

	@Test // 字符转日期
	public void test1() {
		String date = "2017-06-08";
		Date dd = convertToDate(date);
		System.out.println(dd);
	}

	@Test // 日期转字符
	public void test2() {
		Calendar c = Calendar.getInstance();// 创建一个Calendar类型的时间对象
		c.set(2018, 8, 18);// 设置时间
		System.out.println(c.get(Calendar.DAY_OF_MONTH));// 查看是一个月当中的第几天
		Date dd = c.getTime();// 将Calendar类型转换成Date类型
		String ss = convertToDateString(dd);
		System.out.println(ss);
	}
}
