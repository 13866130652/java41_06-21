package zuoye2;

import java.util.Date;

public class Test extends DateUtil {

	public static void main(String[] args) {
		// 把Date转换为字符串
		Date date = new Date();
		String st = convertToDateString(date);
		System.out.println(st);

		// 把字符串解析为Date
		try {
			Date date1 = convertToDate(st);
			System.out.println(date1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
