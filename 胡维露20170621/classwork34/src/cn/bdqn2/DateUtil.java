package cn.bdqn2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// 将字符串日期转换为日期类型
	public Date convertToDate(String st) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-mm-ss");
		Date date = df.parse(st);
		return date;
	}

	// 将日期类型转换为字符串类型
	public String convertToDateString(Date date) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd-mm-ss");
		return f.format(date);// 按照上述格式输出此时日期
	}
}
