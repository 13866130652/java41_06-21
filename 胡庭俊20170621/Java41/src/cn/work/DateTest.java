package cn.work;

//date≤‚ ‘¿‡
public class DateTest {

	public static void main(String[] args) {
		String st = "2017-6-22";
		System.out.println(DateUtil.converToDateString(DateUtil.converToDate(st)));
	}

}
