package zuoye3;

import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		DateUtil a = new DateUtil();
		String date = "2017-06-08";
		Date dd = a.convertToDate(date);
		System.out.println(dd);

		Calendar c = Calendar.getInstance();// 创建一个Calendar类型的时间对象
		c.set(2018, 8, 18);// 设置时间
		Date dd1 = c.getTime();// 将Calendar类型转换成Date类型
		String ss = a.convertToDateString(dd);
		System.out.println(ss);
	}
}
