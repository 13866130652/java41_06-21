package date0621.title3;

import java.util.Date;

public class DateUtil {
	// String ת Date
	public static Date convertToDate(String date) throws Exception {
		try {
			String[] num = date.split("-");
			if (num.length == 3)
				return new Date(Integer.valueOf(num[0]) - 1900, Integer.valueOf(num[1]) - 1, Integer.valueOf(num[2]));
		} catch (Exception x) {
		}
		throw new IllegalArgumentException();
	}

	// Date ת String
	public static String convertToDateString(Date date) {
		StringBuffer sb = new StringBuffer();
		sb.append(date.getYear() + 1900).append("-").append(date.getMonth() + 1).append("-").append(date.getDate());
		return sb.toString();
	}

}
