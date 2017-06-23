package cn.test3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

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

	@Test // �ַ�ת����
	public void test1() {
		String date = "2017-06-08";
		Date dd = convertToDate(date);
		System.out.println(dd);
	}

	@Test // ����ת�ַ�
	public void test2() {
		Calendar c = Calendar.getInstance();// ����һ��Calendar���͵�ʱ�����
		c.set(2018, 8, 18);// ����ʱ��
		System.out.println(c.get(Calendar.DAY_OF_MONTH));// �鿴��һ���µ��еĵڼ���
		Date dd = c.getTime();// ��Calendar����ת����Date����
		String ss = convertToDateString(dd);
		System.out.println(ss);
	}
}
