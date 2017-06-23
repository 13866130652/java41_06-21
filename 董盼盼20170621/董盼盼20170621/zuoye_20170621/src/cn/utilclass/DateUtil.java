package cn.utilclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// ���ַ�������ת��Ϊ��������
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
		return fo.parse(date);
	}

	// ����������ת��Ϊ�ַ�������
	public static String convertToDateString(Date date) {
		SimpleDateFormat fo = new SimpleDateFormat();
		return fo.format(date);
	}
}
