package pers.chen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类：DateUtil类
 * 
 * @author chen
 * @date 20170622
 */
public class DateUtil {

	/**
	 * 将字符串日期转换为日期类型，字符串格式为：”yyyy-MM-dd”，如果转换失败，则抛出异常。
	 * 
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static Date convertToDate(String date) throws Exception {
		try {
			SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(d.parse(date));
			return d.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将日期类型转换为字符串类型，格式为：”yyyy-MM-dd”。
	 */
	public static String convertToDateString(Date date) {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(d.format(date));
		return d.format(date);
	}
}
