package cn.work1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date data=new Date();
	public static SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
	//�ַ���ת��Ϊ��������
	public static Date convertToDate(String date)throws Exception{
		Date d=format.parse(date);
		return d;
	}
	//����������ת��Ϊ�ַ���
	public static String convertToDateString(Date date){
		String st=format.format(date);
		return st;
	}
}
