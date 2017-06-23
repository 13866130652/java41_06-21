package homeWork3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(f.format(DateUtil.convertToDate("2011-12-21")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Date d = new Date();
		System.out.println(DateUtil.convertToDateString(d));

	}
}
