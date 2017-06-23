package pers.chen;

import java.util.Date;

//≤‚ ‘¿‡
public class Test {

	public static void main(String[] args) {
		DateUtil du = new DateUtil();
		try {
			Date date = new Date();
			du.convertToDate("2017-05-12");
			du.convertToDateString(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
