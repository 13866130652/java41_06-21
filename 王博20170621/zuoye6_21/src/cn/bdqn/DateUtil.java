package cn.bdqn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//������
public class DateUtil {
	// 1.���ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd����
	// ���ת��ʧ�ܣ����׳��쳣��
	public static Date convertToDate(String d) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(d);
		return date;

	}

	// 2.����������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
		return format.format(date);

	}
}
