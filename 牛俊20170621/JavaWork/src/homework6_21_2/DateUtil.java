package homework6_21_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��дһ�����ڹ����ࣺDateUtil�� (10��)
 * 3.1)�����ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣��
 * ����ԭ�ͣ�public static Date convertToDate(String date) throws Exception{}
 * 3.2)������������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
 * ����ԭ�ͣ�public static String convertToDateString(Date date){ }
 *  3.3)����д������Test,�����������������в��ԡ�
 */
public class DateUtil {
		public static Date data=new Date();
		public static SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
		//�ַ���ת��Ϊ��������
		public static Date convertToDate(String date)throws Exception{
			Date d=format.parse(date);
			return d;
		}
		//����������ת��Ϊ�ַ���
		public static String convertToDateString(Date date){
			String st=format.format(date);
			return st;
		}
}
