package cn.dqs4;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		boolean demo1 = false;
		boolean demo2 = false;
		boolean demo3 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
		String email = sc.next();
		// ��֤��������������@��.����
		if ((email.contains("@")) && (email.contains("."))) {
			demo1 = true;
		} else {
			System.out.println("�������!");
		}
		// ��֤��������@��.���Ų����ڵ�һ��λ�ã�����@��.���Ų��������һ��
		if ((email.indexOf("@")) != 0 && (email.indexOf("@")) != (email.length() - 1) && (email.indexOf(".")) != 0
				&& (email.indexOf(".")) != (email.length() - 1)) {
			demo2 = true;
		} else {
			System.out.println("�������!");
		}
		// ��֤��������@���ű�����.����֮ǰ������@��.�����м����ٰ���һ���ַ�
		if (email.indexOf(".") > (email.indexOf("@") + 1)) {
			demo3 = true;
		} else {
			System.out.println("�������!");
		}

		if (demo1 && demo2 && demo3) {
			System.out.println("������ȷ");
		} else {
			System.out.println("�������");
		}
	}

}
