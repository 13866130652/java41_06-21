package cn.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ڹ�����
 */
public class DateUtil {
	/**
	 * ���ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣
	 */
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(date);
		} catch (Exception e) {
			throw new Exception("��ǰ�ַ����޷�����ΪDate��");
		}
	}

	/**
	 * ����������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
	 */
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}

	/**
	 * main����
	 */
	public static void main(String[] args) {
		Date date = new Date();

		// ��Dateת��Ϊ�ַ���
		String st = convertToDateString(date);
		System.out.println(st);

		// ���ַ�������ΪDate
		try {
			Date date1 = convertToDate(st);
			System.out.println(date1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
