package q4;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���email�Ƿ���ȷ
		boolean emailCorrect = false;
		String e = sc.next();
		char c = '@';
		char c1 = '.';
		// �����������ʽ
		if (e.contains(String.valueOf(c)) && e.contains(String.valueOf(c1)) && e.indexOf(c) != 0 && e.indexOf(c1) != 0
				&& e.indexOf(c) != -1 && e.indexOf(c1) != -1 && e.indexOf(c1) > e.indexOf(c)) {
			emailCorrect = true;
			System.out.println("���óɹ������������������" + e);
		} else {
			System.out.println("��������Ч��");
		}
	}

}
