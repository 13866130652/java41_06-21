package practice2;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String st = "2014-6-18";
		Date d = new Date();
		try {
			// �ַ���ת��Ϊ����
			System.out.println(DateUtil.convertToDate(st));
			// ��������ת��Ϊ�ַ�������
			System.out.println(DateUtil.convertToDateString(d));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
