package two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");// ������ʽ�������

	// ��String����ת��Ϊ������
	public static Date convertDate(String date) throws ParseException {// �׳��쳣
		// ��String��ת��Ϊ�����ಢ����
		Date d = s.parse(date);
		return d;
	}

	// ��������ת��ΪString����
	public static String converToDateString(Date date) {
		// ��������ת��ΪString�ಢ����
		String st = s.format(date);
		return st;

	}

}
