package cn.bdqn2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//���ַ�������ת��Ϊ��������
	public static Date convertToDate(String date) throws Exception{
		
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		Date d=f.parse(date);
		return d;
		
	}
	//����������ת��Ϊ�ַ�������
	public static String convertToDateString(Date date){
		
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		return f.format(date);
		
	}

}
