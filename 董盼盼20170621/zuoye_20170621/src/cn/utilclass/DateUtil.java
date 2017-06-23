package cn.utilclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// 将字符串日期转换为日期类型
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
		return fo.parse(date);
	}

	// 将日期类型转换为字符串类型
	public static String convertToDateString(Date date) {
		SimpleDateFormat fo = new SimpleDateFormat();
		return fo.format(date);
	}
}
