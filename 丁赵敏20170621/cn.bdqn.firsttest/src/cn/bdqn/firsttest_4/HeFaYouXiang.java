package cn.bdqn.firsttest_4;

import java.util.Scanner;

public class HeFaYouXiang {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean emailCorrect = false;// ���email�Ƿ���ȷ
		boolean emailCorrect1 = false;// ���email�Ƿ���ȷ

		System.out.println("*************��ӭ���������ж�ϵͳ************");
		System.out.println("������������䣺");
		String email = sc.next();
		// �����������Ƿ���ȷ
		if (email.contains("@") && email.contains(".")) {
			emailCorrect = true;
		} else {
			emailCorrect = false;
		}
		// �ж������@��.��λ���Ƿ�Ϸ�
		if (email.indexOf('@') != 0 && (email.lastIndexOf("@") != email.length() - 1)
				&& (email.lastIndexOf(".") != email.length() - 1) && (email.indexOf('.') > email.indexOf('@') + 1)) {
			emailCorrect1 = true;
		} else {
			emailCorrect1 = false;
		}
		if (emailCorrect && emailCorrect1) {
			System.out.println("����Ϸ���");
		} else {
			System.out.println("���䲻�Ϸ���");
		}

	}
}
