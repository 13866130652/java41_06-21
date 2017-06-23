package cn.bdqn2;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(DateUtil.convertToDate("2018-6-15"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(DateUtil.convertToDateString(new Date()));
	}

}
