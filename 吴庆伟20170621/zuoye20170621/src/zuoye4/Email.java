package zuoye4;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		boolean emailCorrect = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("��������������");
		String eamil = sc.next();
		// �Ƿ���@��. @�Ƿ���.ǰ��
		if (eamil.lastIndexOf('@') != -1 && eamil.lastIndexOf('.') > eamil.lastIndexOf('@')) {
			// @��.�Ƿ��ڵ�һλ�����һλ
			if (eamil.indexOf('@') != 0 && eamil.lastIndexOf('.') != eamil.length() - 1) {
				// @��.֮��������һλ�ַ�
				if (eamil.lastIndexOf('.') - eamil.lastIndexOf('@') > 1) {
					emailCorrect = true;
					System.out.println("�������䣡");
				} else {
					System.out.println("@��.֮��������һ���ַ�");
				}
			} else {
				System.out.println("@��.�����ٵ�һλ�������һλ");
			}
		} else {
			System.out.println("��ȷ���Ƿ���@��.����@Ҫ��.ǰ��");
		}

	}

}
