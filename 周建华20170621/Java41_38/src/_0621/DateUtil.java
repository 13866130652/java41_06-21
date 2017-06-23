package _0621;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	//将字符串日期转换为日期类型
	public static Date convertToDate(String date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(date);
		return d ;		
	}	
	//将日期类型转换为字符串类型
		public static String convertToDateString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat();
		String st=sdf.format(date);
		return st;		
	}


}
