package cn.zuoye1;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		String date = "2016-5-20";
		try {
			System.out.println(DateUtil.convertToDate(date));
		} catch (Exception e) {

			e.printStackTrace();
		}
		Calendar cl = Calendar.getInstance();
		System.out.println(DateUtil.convertToDateString(cl.getTime()));
	}

}
