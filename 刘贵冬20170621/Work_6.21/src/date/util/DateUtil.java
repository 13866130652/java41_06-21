package date.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateUtil {
	public static Date convertToDate(String date) throws Exception {
		String[] ss = date.split("-");
		// �жϸ�ʽ�Ƿ���ȷ������ȷ�׳��쳣
		if (ss.length == 3 && ss[0].length() > 0 && ss[1].length() > 0 && ss[1].length() <= 2 && ss[2].length() > 0
				&& ss[2].length() <= 2) {
			for (String s : ss) {
				char[] cs = s.toCharArray();
				for (char c : cs) {
					if (!Character.isDigit(c)) {
						throw new Exception("���ڸ�ʽ����");
					}
				}
			}
		} else {
			throw new Exception("���ڸ�ʽ����");
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
		System.out.println("���������ڣ�");
		String in = input.next();
		try {
			Date date = convertToDate(in);
			System.out.println("��ʽת���ɹ���\n" + date);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		System.out.println("���ڵ�����Ϊ��" + convertToDateString(new Date()));
	}
}
