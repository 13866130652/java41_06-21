package zuoye3;

import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		DateUtil a = new DateUtil();
		String date = "2017-06-08";
		Date dd = a.convertToDate(date);
		System.out.println(dd);

		Calendar c = Calendar.getInstance();// ����һ��Calendar���͵�ʱ�����
		c.set(2018, 8, 18);// ����ʱ��
		Date dd1 = c.getTime();// ��Calendar����ת����Date����
		String ss = a.convertToDateString(dd);
		System.out.println(ss);
	}
}
