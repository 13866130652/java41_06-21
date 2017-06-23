package cn.bdqn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {

		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date d = DateUtil.convertToDate("2017-5-23");
			System.out.println(format.format(d));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date = new Date();
		String st = DateUtil.convertToDateString(date);
		System.out.println(st);
	}
}
