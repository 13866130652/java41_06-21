package Three;

import java.util.Scanner;

public class Mailbox {

	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		System.out.print("�������ţ�");
		String s = sb.next();
		if (s.indexOf('.') > 0 && s.indexOf('@') > 0) {// �ж�'.'��'@'�Ƿ�������Ƿ��ڵ�һλ
			if (s.indexOf('.') != s.length() - 1 && s.indexOf('@') != s.length() - 1) {// �ж�'.'��'@'�Ƿ������һλ
				if (s.indexOf('.') - s.indexOf('@') > 1) {// �ж�'@'�Ƿ���'.'֮ǰ���Ƿ���һ�������ַ�
					System.out.println("������������ʽ��ȷ��");
					return;
				}
			}
		}
		System.out.println("������������ʽ����ȷ��");
	}

}
