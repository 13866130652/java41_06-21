package zuoye20170621_3;

import java.util.Calendar;
import java.util.Date;

//������
public class Test {

	public static void main(String[] args) {
		// ��������
		DateUtil a = new DateUtil();
		String st = "2017-06-22";
		try {
			// ���ͨ��������������ķ���
			System.out.println(a.convertToDate(st));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ����һ��Calendar���͵�ʱ�����
		Calendar cd = Calendar.getInstance();
		// ����ʱ��
		cd.set(2017, 05, 22);
		// �����������
		Date date = cd.getTime();
		// �ж���һ���еĵڶ�����
		int year = cd.get(cd.DAY_OF_YEAR);
		// �ж���һ���еĵڶ�����
		int month = cd.get(cd.DAY_OF_MONTH);
		System.out.println(a.convertToDateString(date) + ",����һ���еĵ�" + year + "��,����һ�����еĵ�" + month + "��");
	}

}
