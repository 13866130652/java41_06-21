package cn.test4;

import java.util.Scanner;

public class StringDemo {
	public static boolean isRight(String y) {
		// ������β�±�
		int d1 = y.indexOf("@");
		int d11 = y.lastIndexOf("@");
		int d2 = y.indexOf(".");
		int d22 = y.lastIndexOf(".");
		boolean f1 = false, f2 = false, f3 = false, f = false;
		// �ж�"@""."�Ƿ����
		if (d1 != -1 && d2 != -1) {
			f1 = true;
		}
		// �ж��Ƿ�����βλ��
		if ((d1 != 0 && d11 != y.length() - 1) && (d2 != 0 && d22 != y.length() - 1)) {
			f2 = true;
		}
		// �ж�@�Ƿ���.ǰ��
		if (d22 > d1 + 1) {
			f3 = true;
		}
		// �ж����������Ƿ�����
		if (f1 && f2 && f3) {
			f = true;
		}
		return f;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		do {
			System.out.println("��������������");
			String yx = input.next();
			if (isRight(yx)) {
				System.out.println("����Ϸ�");
			} else {
				System.out.println("���Ϸ�");
			}
			flag = isRight(yx);
		} while (!flag);

	}
}
