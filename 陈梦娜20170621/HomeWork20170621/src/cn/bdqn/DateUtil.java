package cn.bdqn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//���ڹ�����DateUtil
public class DateUtil {
	// �ַ���ת����������
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d = format.parse(date);
		return d;
	}

	// ��������ת�����ַ���
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String st = format.format(date);
		return st;
	}
}
