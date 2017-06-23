package date.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateUtil {
	public static Date convertToDate(String date) throws Exception {
		String[] ss = date.split("-");
		// 判断格式是否正确，不正确抛出异常
		if (ss.length == 3 && ss[0].length() > 0 && ss[1].length() > 0 && ss[1].length() <= 2 && ss[2].length() > 0
				&& ss[2].length() <= 2) {
			for (String s : ss) {
				char[] cs = s.toCharArray();
				for (char c : cs) {
					if (!Character.isDigit(c)) {
						throw new Exception("日期格式错误！");
					}
				}
			}
		} else {
			throw new Exception("日期格式错误！");
		}

		Calendar rightNow = Calendar.getInstance();
		rightNow.set(Integer.valueOf(ss[0]), Integer.valueOf(ss[1]) - 1, Integer.valueOf(ss[2]));
		return rightNow.getTime();
	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		return formater.format(date).toString();
	}

	@Test
	public void testDateUtil() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入日期：");
		String in = input.next();
		try {
			Date date = convertToDate(in);
			System.out.println("格式转换成功！\n" + date);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		System.out.println("现在的日期为：" + convertToDateString(new Date()));
	}
}
