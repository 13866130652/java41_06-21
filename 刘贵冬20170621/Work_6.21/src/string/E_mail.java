package string;

import java.util.Scanner;

/**
 * ��������ĵ��������ַ������֤����ȷ��
 * 
 * @author lgd
 */
public class E_mail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������Email��ַ(����exit����)��");
		String in = null;
		while (true) {
			in = input.next().trim();
			// ��������������@��.����
			if (in.contains(".") && in.contains("@")) {
				// ��������@��.���Ų����ڵ�һ��λ�ã�����@��.���Ų��������һ��
				if ((in.indexOf(".") != 0 && in.indexOf(".") != in.length() - 1)
						&& (in.indexOf("@") != 0 && in.indexOf("@") != in.length() - 1)) {
					// ��������@���ű�����.����֮ǰ������@��.�����м����ٰ���һ���ַ�
					if (in.indexOf(".") > in.indexOf("@") + 1) {
						System.out.println("��ַ������ȷ��������ĵ�ַ�ǣ�" + in);
						input.close();
						break;
					}
				}
			}
			if (in.equalsIgnoreCase("exit")) {
				System.out.println("ллʹ�ã�");
				input.close();
				break;
			}
			System.out.println("��ַ�����������������(����exit����)��");
		}
	}
}
