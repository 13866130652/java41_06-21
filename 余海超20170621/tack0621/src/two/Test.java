package two;

import java.text.ParseException;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// ���ַ���ת��Ϊ�����ಢ���
		String s = "2017-06-23";
		Date date = DateUtil.convertDate(s);
		System.out.println(date);
		// ��ת�õ�����������ת��Ϊ�ַ������
		System.out.println(DateUtil.converToDateString(date));
	}

}
