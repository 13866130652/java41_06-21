package cn.bdqn.firsttest_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataUtil {
	static Scanner sc = new Scanner(System.in);

	// �ַ�����ʽΪ����yyyy-MM-dd��
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = sd.parse(date);
		return dd;// ����������ʽ
	}

	public static String convertToDateString(Date date) {
		SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
		return ss.format(date);// ����string����
	}
}
