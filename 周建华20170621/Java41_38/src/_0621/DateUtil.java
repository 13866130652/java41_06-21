package _0621;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	//���ַ�������ת��Ϊ��������
	public static Date convertToDate(String date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(date);
		return d ;		
	}	
	//����������ת��Ϊ�ַ�������
		public static String convertToDateString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat();
		String st=sdf.format(date);
		return st;		
	}


}
