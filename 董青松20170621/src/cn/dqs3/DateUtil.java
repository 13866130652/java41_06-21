package cn.dqs3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  3.1)�����ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣��
 ����ԭ�ͣ�public static Date convertToDate(String date) throws Exception{}
   3.2)������������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
����ԭ�ͣ�public static String convertToDateString(Date date){ }
   3.3)����д������Test,�����������������в��ԡ�
 */
public class DateUtil {

	// ���ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date data = format.parse(date);
		System.out.println(data);
		return data;
	}

	// ����������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String data = format.format(date);
		System.out.println(data);
		return data;
	}

}
