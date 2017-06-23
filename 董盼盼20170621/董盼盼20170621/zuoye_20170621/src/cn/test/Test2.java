package cn.test;

import java.util.Date;

import cn.utilclass.DateUtil;

//≤‚ ‘¿‡
public class Test2 {

	public static void main(String[] args) {
		try {
			System.out.println(DateUtil.convertToDate("2017-06-5"));
			Date date = new Date(2016, 0, 12);
			System.out.println(DateUtil.convertToDateString(date));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
