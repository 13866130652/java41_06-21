package q4;

import q3.DateUtil;

public class Test {

	public static void main(String[] args) {
		DateUtil d = new DateUtil();
		// Stringת��Ϊ����
		try {
			System.out.println(d.convertToDate("2018-09-09"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ����ת��Ϊstring
		d.convertToString();
	}
}
