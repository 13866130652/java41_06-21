package cn.bdqn;

import java.util.Scanner;

//��֤�����Ƿ�Ϸ�
public class EmailDemo {

	public static void main(String[] args) {
		boolean email = false;// ��������Ƿ���ȷ
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("��������������");
			String name = input.next();
			int index = name.lastIndexOf(".");
			if (name.indexOf('@') != -1 && name.indexOf('@') != 0//
					&& name.indexOf('.') != -1 && name.indexOf('.') != 0 //
					&& name.indexOf('.') > name.indexOf('@') + 1//
					&& name.lastIndexOf('.') != name.length() - 1 && //
					name.lastIndexOf('@') != name.length() - 1) {
				email = true;
				System.out.println("������ȷ");
				break;
			} else {
				System.out.println("������Ч");
			}
		}
	}
}
