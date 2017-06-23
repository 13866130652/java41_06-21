package cn.bdqn.firsttest_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataUtil {
	static Scanner sc = new Scanner(System.in);

	// 字符串格式为：”yyyy-MM-dd”
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = sd.parse(date);
		return dd;// 返回日期形式
	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
		return ss.format(date);// 返回string类型
	}
}
