package zuoye2;

/**
 * 3)��дһ�����ڹ����ࣺDateUtil�� (10��)
   3.1)�����ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣��
 ����ԭ�ͣ�public static Date convertToDate(String date) throws Exception{}
   3.2)������������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
����ԭ�ͣ�public static String convertToDateString(Date date){ }
   3.3)����д������Test,�����������������в��ԡ�
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	// ���ַ�������ת��Ϊ�������ͣ��ַ�����ʽΪ����yyyy-MM-dd�������ת��ʧ�ܣ����׳��쳣
	public static Date convertToDate(String date) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(date);
		} catch (Exception e) {
			throw new Exception("��ǰ�ַ����޷�����ΪDate��");
		}
	}

	// ����������ת��Ϊ�ַ������ͣ���ʽΪ����yyyy-MM-dd����
	public static String convertToDateString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}

}