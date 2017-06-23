/**
 * 
 */
package q3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Zhi Chen
 *
 */
public class DateUtil {
	public static Date convertToDate(String date) throws Exception {
		Date d = new Date();
		d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		return d;
	}

	public static void convertToString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(new Date());
		System.out.println(s);
	}
}
