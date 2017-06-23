package _0621;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		DateUtil d=new DateUtil();
		SimpleDateFormat sdf=new SimpleDateFormat();
		try {
			System.out.println(sdf.format(d.convertToDate("2017-06-22")));
			System.out.println(d.convertToDateString(new Date()));
		} catch (Exception e) {
			e.printStackTrace();
		}

}




}
