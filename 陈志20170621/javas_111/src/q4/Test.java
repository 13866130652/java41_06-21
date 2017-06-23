package q4;

import q3.DateUtil;

public class Test {

	public static void main(String[] args) {
		DateUtil d = new DateUtil();
		// String转化为日期
		try {
			System.out.println(d.convertToDate("2018-09-09"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 日期转换为string
		d.convertToString();
	}
}
