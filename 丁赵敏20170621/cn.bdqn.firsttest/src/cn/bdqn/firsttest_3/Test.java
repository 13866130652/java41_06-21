package cn.bdqn.firsttest_3;

import java.util.Date;

public class Test {
	// ������
	public static void main(String[] args) {
		DataUtil uti = new DataUtil();
		// ��������쳣���׳�
		try {
			System.out.println(uti.convertToDate("2017-06-12"));
		} catch (Exception e) {

			e.printStackTrace();
		}
		// �ַ���ʽ�����ǰ�����ַ�����ʽΪ����yyyy-MM-dd��
		Date date = new Date();
		System.out.println(uti.convertToDateString(date));
	}

}
