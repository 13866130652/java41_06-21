package zuoye20170621_4;

import java.util.Scanner;

//������
public class StringDemo {
	public static boolean xm(String a) {
		// ��int���Ͷ�����յ�һ��@�±�
		int at = a.indexOf("@");
		// ��int���Ͷ���������һ��@�±�
		int at1 = a.lastIndexOf("@");
		// ��int���Ͷ�����յ�һ��.�±�
		int dian = a.indexOf(".");
		// ��int���Ͷ���������һ��.�±�
		int dian1 = a.lastIndexOf(".");
		boolean g = false, g1 = false, g2 = false, gz = false;
		// �жϵ�һ��@���һ��.�Ƿ����
		if (at != -1 && dian != -1) {
			g = true;
		}
		// �жϵ�һ��@���һ��.�Ƿ��ڵ�һ��λ�ã����һ��@�����һ��.�Ƕ������һ��λ��
		if (at != 0 && dian != 0 && at1 != a.length() - 1 && dian1 != a.length() - 1) {
			g1 = true;
		}
		// �ж������ֵ�@���һ��.֮���Ƿ�����ַ�
		if (at1 + 1 < dian) {
			g2 = true;
		}
		// ����Ƿ���ȷ
		if (g && g1 && g2) {
			gz = true;
		}
		return gz;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			flag = false;
			System.out.print("����������:");
			String yx = sc.next();
			if (xm(yx)) {
				System.out.println("�����������Ϸ���");
			} else {
				System.out.println("����������䲻�Ϸ�������������:");
				flag = true;
			}
		} while (flag);
	}

}
