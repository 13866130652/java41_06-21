package cn.bdqn2;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// ��������
		DateUtil d = new DateUtil();

		// ����convertToDate(String st)����

		try {
			String st = "2017-12-12-12-12";
			System.out.println(d.convertToDate(st));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ����convertToDateString(Date date)����
		Date date = new Date();
		System.out.println(d.convertToDateString(date));

	}

}
