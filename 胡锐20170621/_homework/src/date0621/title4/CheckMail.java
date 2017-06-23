package date0621.title4;

import java.util.Scanner;

public class CheckMail {
	// ��������ַ
	public static boolean mailCheck(String mail) {
		if (mail == null) {// mail==null;
			return false;
		} else if ((mail.indexOf("@") == -1) || (mail.indexOf(".") == -1)) {// û��"@"��"."
			return false;
		} else if (mail.indexOf("@") != mail.lastIndexOf("@")) {// "@"�ж��
			return false;
		} else if (mail.indexOf("@") > mail.indexOf(".")) {// "."��"@"ǰ
			return false;
		} else if (mail.startsWith("@") || mail.endsWith(".")) {// "@"��ͷ��"."��β
			return false;
		} else if ((mail.indexOf("@.") != -1) || (mail.indexOf("..") != -1)) {// ����"@."��".."
			return false;
		} else {
			return true;
		}
	}

	// ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("��������:");
			System.out.println(mailCheck(sc.next()));
		}
	}
}
