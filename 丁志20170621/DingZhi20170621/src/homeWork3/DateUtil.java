package homeWork3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 3)����дһ�����ڹ����ࣺDateUtil�� (10��)
 * 3.1)�����ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣�� ����ԭ�ͣ�public static Date
 * convertToDate(String date) throws Exception{}
 * 3.2)������������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd���� ����ԭ�ͣ�public static String
 * convertToDateString(Date date){ } 3.3)����д������Test,�����������������в��ԡ�
 */
public class DateUtil {
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");// ��������,������
		Date d = formater.parse(date);
		return d;
	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		return formater.format(date);
	}
}
