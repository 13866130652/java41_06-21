package zuye1;

import java.util.Date;

//������
public class Test {

	public static void main(String[] args) {
		// ����DateUtilDemo�����
		DateUtilDemo dg = new DateUtilDemo();
		Date date = new Date();
		// ���÷���
		try {
			System.out.println("�ַ�������ת������������:" + dg.convertToDate("2017-6-22"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��������ת�����ַ�������:" + dg.convertToDateString(date));
	}

}
