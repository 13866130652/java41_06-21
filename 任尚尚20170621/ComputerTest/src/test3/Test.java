package test3;

import java.util.Date;
/**
 * @author ������
 * ��д������Test
 */
public class Test {
	public static void main(String[] args) {
		//��������
		DateUtil du =new DateUtil();
		Date d = new Date();
		try {
			//String-->Date
			System.out.println(du.convertToDate("2017-06-22"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Date-->String
		System.out.println(du.convertToDateString(d));
	}
}
