package zuoye3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		Date d = s.parse(date);

		return d;
	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

		return s.format(date);
	}
}
