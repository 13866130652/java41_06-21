package cn.bdqn1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		DateUtil d=new DateUtil();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(format.format(d.convertToDate("2017-06-10")));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(d.convertToDateString(new Date()));
	}

}
