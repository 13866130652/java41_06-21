package zuye1;

import java.util.Date;

//测试类
public class Test {

	public static void main(String[] args) {
		// 创建DateUtilDemo类对象
		DateUtilDemo dg = new DateUtilDemo();
		Date date = new Date();
		// 调用方法
		try {
			System.out.println("字符串日期转换成日期类型:" + dg.convertToDate("2017-6-22"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("日期类型转换成字符串日期:" + dg.convertToDateString(date));
	}

}
