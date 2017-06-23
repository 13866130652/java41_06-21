package homework6_21_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work2Test {
	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(format.format(DateUtil.convertToDate("2017-07-07")));;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(DateUtil.convertToDateString(new Date()));
	}
}
