package disanti;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date change(String date){
		try{
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
			Date d = sd.parse(date);
			return d;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static String changeTo(Date date){
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		String st = new String(s.format(date));
		return st;
	}

}
