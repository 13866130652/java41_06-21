package date0621.title4;

import java.util.Scanner;

public class CheckMail {
	// 检查邮箱地址
	public static boolean mailCheck(String mail) {
		if (mail == null) {// mail==null;
			return false;
		} else if ((mail.indexOf("@") == -1) || (mail.indexOf(".") == -1)) {// 没有"@"或"."
			return false;
		} else if (mail.indexOf("@") != mail.lastIndexOf("@")) {// "@"有多个
			return false;
		} else if (mail.indexOf("@") > mail.indexOf(".")) {// "."在"@"前
			return false;
		} else if (mail.startsWith("@") || mail.endsWith(".")) {// "@"开头或"."结尾
			return false;
		} else if ((mail.indexOf("@.") != -1) || (mail.indexOf("..") != -1)) {// 存在"@."或".."
			return false;
		} else {
			return true;
		}
	}

	// 测试
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("输入邮箱:");
			System.out.println(mailCheck(sc.next()));
		}
	}
}
