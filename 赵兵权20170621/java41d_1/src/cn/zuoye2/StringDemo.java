package cn.zuoye2;

public class StringDemo {
	// �ж�����������ʽ�Ƿ�Ϸ�
	public static boolean useFul(String emial) {
		int a = emial.indexOf('@');
		int b = emial.indexOf('.');
		int c = emial.lastIndexOf('@');
		int d = emial.lastIndexOf('.');
		// �ж������Ƿ�ͬʱ����@��.
		if (emial.contains("@") && emial.contains(".")) {
			// �����@��.���Ų��ܳ����ڵ�һ��λ�ã���@��.���ܳ��������һ��
			if (((a != 0) && (b != 0)) && ((c != emial.length()) && (d != emial.length()))) {
				// @����.֮ǰ������֮�����������һ���ַ�
				if (a + 2 <= b) {
					return true;
				}
			}
		}
		return false;
	}
}
