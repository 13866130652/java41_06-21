package date0621.title3;

import java.util.Date;

public class Test {
	// ≤‚ ‘
	public static void main(String[] args) {
		try {
			Date d = DateUtil.convertToDate("2015-8-9");
			System.out.println(d);
			System.out.println(DateUtil.convertToDateString(d));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
