package zuye1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilDemo {
	// �ַ�������ת������������
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(date);
	}

	// ��������ת�����ַ�������
	public static String convertToDateString(Date date) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String st = sf.format(date);
		return st;

	}

}
