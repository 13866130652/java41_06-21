package cn.dqs3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		DateUtil du = new DateUtil();

		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");
		String st = df.format(date);

		// ���ַ�������ΪDate
		try {
			du.convertToDate(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��Dateת��Ϊ�ַ���
		du.convertToDateString(date);

	}

}
