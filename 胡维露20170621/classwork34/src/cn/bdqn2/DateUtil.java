package cn.bdqn2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// ���ַ�������ת��Ϊ��������
	public Date convertToDate(String st) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-mm-ss");
		Date date = df.parse(st);
		return date;
	}

	// ����������ת��Ϊ�ַ�������
	public String convertToDateString(Date date) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd-mm-ss");
		return f.format(date);// ����������ʽ�����ʱ����
	}
}
