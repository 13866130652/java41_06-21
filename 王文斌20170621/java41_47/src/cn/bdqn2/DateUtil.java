package cn.bdqn2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//将字符串日期转换为日期类型
	public static Date convertToDate(String date) throws Exception{
		
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		Date d=f.parse(date);
		return d;
		
	}
	//将日期类型转换为字符串类型
	public static String convertToDateString(Date date){
		
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		return f.format(date);
		
	}

}
