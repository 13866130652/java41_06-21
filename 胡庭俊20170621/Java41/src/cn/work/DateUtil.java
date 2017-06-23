package cn.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//���ڹ�����
public class DateUtil {
	//���ַ���ת��Ϊdate����
	public static Date converToDate(String st) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date=format.parse(st);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	//��date����ת��Ϊ�ַ���
	public static String converToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
}
