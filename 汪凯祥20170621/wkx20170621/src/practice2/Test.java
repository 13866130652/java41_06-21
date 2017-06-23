package practice2;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String st = "2014-6-18";
		Date d = new Date();
		try {
			// 字符串转换为日期
			System.out.println(DateUtil.convertToDate(st));
			// 日期类型转换为字符串类型
			System.out.println(DateUtil.convertToDateString(d));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
