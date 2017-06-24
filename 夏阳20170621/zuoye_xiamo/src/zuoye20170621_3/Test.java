package zuoye20170621_3;

import java.util.Calendar;
import java.util.Date;

//测试类
public class Test {
	//测试
	public static void main(String[] args) {
		// 创建对象
		DateUtil a = new DateUtil();
		String st = "2017-06-22";
		try {
			// 输出通过对象引用里面的方法
			System.out.println(a.convertToDate(st));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 创建一个Calendar类型的时间对象
		Calendar cd = Calendar.getInstance();
		// 设置时间
		cd.set(2017, 05, 22);
		// 获得日期类型
		Date date = cd.getTime();
		// 判断这一年中的第多少天
		int year = cd.get(cd.DAY_OF_YEAR);
		// 判断这一月中的第多少天
		int month = cd.get(cd.DAY_OF_MONTH);
		System.out.println(a.convertToDateString(date) + ",是这一年中的第" + year + "天,是这一个月中的第" + month + "天");
	}

}
