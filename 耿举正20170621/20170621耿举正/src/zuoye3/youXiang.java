package zuoye3;

import java.util.Scanner;

public class youXiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������ȷ�������ַ��");

		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		if (email.indexOf("@") == email.lastIndexOf("@") && email.indexOf(".") == email.lastIndexOf(".")) {
			if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
				// �����û��@��.
				if ((email.indexOf("@") != 0 && email.indexOf(".") != 0)
						&& (email.lastIndexOf("@") != email.length() - 1
								&& email.lastIndexOf(".") != email.length() - 1)) {
					// ���������С�@����.��������λ ���������С�@����.������ĩλ

					// ����@���ű�����.����֮ǰ������@��.�����м����ٰ���һ���ַ���
					if (email.indexOf(".") - email.indexOf("@") > 1) {
						System.out.println("����Ϸ�");
					} else {
						System.out.println("����@��.ǰ��˳������������������");
					}

				} else {
					System.out.println("��������@ .λ�ô���@��.����ͷ����β������������");
				}
			} else {
				System.out.println("����@��.����û��������ȫ������������");
			}
		} else {
			System.out.println("������ڶ��@ .������������");
		}
	}
}