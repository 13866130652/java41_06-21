package cn.bdqn.firsttest_3;

import java.util.Date;

public class Test {
	// 测试类
	public static void main(String[] args) {
		DataUtil uti = new DataUtil();
		// 如果输入异常则被抛出
		try {
			System.out.println(uti.convertToDate("2017-06-12"));
		} catch (Exception e) {

			e.printStackTrace();
		}
		// 字符形式输出当前日期字符串格式为：”yyyy-MM-dd”
		Date date = new Date();
		System.out.println(uti.convertToDateString(date));
	}

}
