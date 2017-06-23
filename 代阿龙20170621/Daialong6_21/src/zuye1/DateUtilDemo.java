package zuye1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilDemo {
	// 字符串日期转换成日期类型
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(date);
	}

	// 日期类型转换成字符串日期
	public static String convertToDateString(Date date) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String st = sf.format(date);
		return st;

	}

}
