package pers.chen;

import java.util.Scanner;

/**
 * ��֤�����Ƿ�Ϸ�
 * 
 * @author chen
 * @date 20170622
 */
public class ExtractString {
	public static Scanner sc = new Scanner(System.in);

	public static boolean isLegalID() {
		System.out.print("�����������ַ��");
		String mail = sc.next();
		// �ж�@ . �Ƿ�����Ҳ�����β
		if (mail.indexOf('@') != -1 && mail.indexOf('@') != 0 && mail.indexOf('.') != -1 && mail.indexOf('.') != 0) {
			// �ж�@ . �Ƿ���ĩλ
			if (mail.lastIndexOf('@') != (mail.length() - 1) && mail.lastIndexOf('.') != (mail.length() - 1)) {
				// �ж�@ �Ƿ��� . ֮ǰ�����м����ٴ���һ���ַ�
				if (mail.lastIndexOf('.') > (mail.lastIndexOf('@') + 1)) {
					System.out.println("�����ַ�Ϸ���");
				} else {
					System.out.println("�����ַ���Ϸ���");
				}
			} else {
				System.out.println("�����ַ���Ϸ���");
			}
		} else {
			System.out.println("�����ַ���Ϸ���");
		}
		return false;

	}

	public static void main(String[] args) {
		isLegalID();
	}

}
