package cn.zuoye1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// 将字符串日期转换为日期类型
	public static Date convertToDate(String date) throws Exception {
		DateFormat df = DateFormat.getDateInstance();
		Date f = df.parse(date);
		return f;

	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sf.format(date);
		return s;
	}
}
