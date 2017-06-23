package two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");// 创建格式化类对象

	// 把String类型转化为日期类
	public static Date convertDate(String date) throws ParseException {// 抛出异常
		// 将String类转化为日期类并返回
		Date d = s.parse(date);
		return d;
	}

	// 把日期类转化为String类型
	public static String converToDateString(Date date) {
		// 将日期类转化为String类并返回
		String st = s.format(date);
		return st;

	}

}
