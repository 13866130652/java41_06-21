package cn.work1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date data=new Date();
	public static SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
	//字符串转换为日期类型
	public static Date convertToDate(String date)throws Exception{
		Date d=format.parse(date);
		return d;
	}
	//将日期类型转换为字符串
	public static String convertToDateString(Date date){
		String st=format.format(date);
		return st;
	}
}
