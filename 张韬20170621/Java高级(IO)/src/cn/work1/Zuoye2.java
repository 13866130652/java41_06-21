package cn.work1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*/
 * ���ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣��
 ����ԭ�ͣ�public static Date convertToDate(String date) throws Exception{}
   3.2)������������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
����ԭ�ͣ�public static String convertToDateString(Date date){ }
   3.3)����д������Test,�����������������в��ԡ�

 */
public class Zuoye2 {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(format.format(DateUtil.convertToDate("2017-07-07")));;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(DateUtil.convertToDateString(new Date()));
	}

}
