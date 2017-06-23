package zuoye20170621_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// 创建静态convertToDate()方法
	public static Date convertToDate(String date) throws Exception {
		// 创建日期格式对象
		DateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		// 创建Date类型的对象接收a.parse(date)
		Date d = null;
		d = a.parse(date);// 把字符串转化成日期类型
		return d;
	}
	// @Test
	// public void xm() {
	// String sj = "2017-06-21";
	// try {
	// System.out.println(convertToDate(sj));
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	// 创建静态convertToDateString()方法
	public static String convertToDateString(Date date) {
		// 创建日期格式对象
		DateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		// 创建String类型的对象接收a.format(date)
		String num = "";
		num = a.format(date);// 把日期类型转化成字符串类型
		return num;
	}
	// @Test
	// public void xm1() {
	// Calendar cd = Calendar.getInstance();
	// cd.set(2017, 06, 21);
	// Date date = cd.getTime();
	// System.out.println(convertToDateString(date));
	// }
}