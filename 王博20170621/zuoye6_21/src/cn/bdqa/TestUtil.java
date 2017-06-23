package cn.bdqa;

import java.util.Date;

//≤‚ ‘»’∆⁄¿‡
public class TestUtil {
	public static void main(String[] args) {
		DateUtil date = new DateUtil();
		try {
			Date d = date.convertToDate("2011-12-09");
			System.out.println(date.convertToDateString(d));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
