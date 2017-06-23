package test3;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author ������
 * ��дһ�����ڹ����ࣺDateUtil��
 */
public class DateUtil {
	//���ַ�������ת��Ϊ��������
	public Date convertToDate(String date) throws Exception{
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		try {
			d = sdf.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	//����������ת��Ϊ�ַ�������
	public String convertToDateString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String st = sdf.format(date);
		return st;
	}
}
