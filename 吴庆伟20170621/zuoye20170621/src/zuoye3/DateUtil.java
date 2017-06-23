package zuoye3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// 1.�ַ���ת�������ڷ���
	public static Date convertToDate(String date) {
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd");// �������ڸ�ʽ����
		Date d1 = null;
		try {
			d1 = d.parse(date);// ���ַ���ת�������ڸ�ʽ
			return d1;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 2.������ת��Ϊ�ַ�������
	public static String convertToDateString(Date date) {
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd");// �������ڸ�ʽ����
		String s = "";
		s = d.format(date);// ����format()����������ת�����ַ�������
		return s;
	}
}
