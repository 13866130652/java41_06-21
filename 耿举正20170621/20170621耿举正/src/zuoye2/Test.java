package zuoye2;

import java.util.Date;

public class Test extends DateUtil {

	public static void main(String[] args) {
		// ��Dateת��Ϊ�ַ���
		Date date = new Date();
		String st = convertToDateString(date);
		System.out.println(st);

		// ���ַ�������ΪDate
		try {
			Date date1 = convertToDate(st);
			System.out.println(date1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
