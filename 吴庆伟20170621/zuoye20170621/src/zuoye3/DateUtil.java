package zuoye3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
}
