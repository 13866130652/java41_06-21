package cn.bdqn2;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// 创建对象
		DateUtil d = new DateUtil();

		// 测试convertToDate(String st)方法

		try {
			String st = "2017-12-12-12-12";
			System.out.println(d.convertToDate(st));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 测试convertToDateString(Date date)方法
		Date date = new Date();
		System.out.println(d.convertToDateString(date));

	}

}
