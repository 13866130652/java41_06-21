package practice2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣��
 * 
 * ����ԭ�ͣ�public static Date convertToDate(String date) throws Exception{}
 * 
 * ����������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
 * 
 * ����ԭ�ͣ�public static String convertToDateString(Date date){ }
 *
 */
public class DateUtil {
	// ���ַ�������ת��Ϊ��������
	public static Date convertToDate(String date) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = df.parse(date);
		return d;
	}

	// ����������ת��Ϊ�ַ�������
	public static String convertToDateString(Date date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String st = df.format(date);
		return st;
	}
}
