package zuoye20170621_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// ������̬convertToDate()����
	public static Date convertToDate(String date) throws Exception {
		// �������ڸ�ʽ����
		DateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		// ����Date���͵Ķ������a.parse(date)
		Date d = null;
		d = a.parse(date);// ���ַ���ת������������
		return d;
	}
	// @Test
	// public void xm() {
	// String sj = "2017-06-21";
	// try {
	// System.out.println(convertToDate(sj));
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	// ������̬convertToDateString()����
	public static String convertToDateString(Date date) {
		// �������ڸ�ʽ����
		DateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		// ����String���͵Ķ������a.format(date)
		String num = "";
		num = a.format(date);// ����������ת�����ַ�������
		return num;
	}
	// @Test
	// public void xm1() {
	// Calendar cd = Calendar.getInstance();
	// cd.set(2017, 06, 21);
	// Date date = cd.getTime();
	// System.out.println(convertToDateString(date));
	// }
}