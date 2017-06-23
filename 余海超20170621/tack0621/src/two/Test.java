package two;

import java.text.ParseException;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// 将字符串转化为日期类并输出
		String s = "2017-06-23";
		Date date = DateUtil.convertDate(s);
		System.out.println(date);
		// 将转得到的日期类再转化为字符串输出
		System.out.println(DateUtil.converToDateString(date));
	}

}
