package test3;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author 任尚尚
 * 编写一个日期工具类：DateUtil类
 */
public class DateUtil {
	//将字符串日期转换为日期类型
	public Date convertToDate(String date) throws Exception{
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		try {
			d = sdf.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	//将日期类型转换为字符串类型
	public String convertToDateString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String st = sdf.format(date);
		return st;
	}
}
