package q4;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 标记email是否正确
		boolean emailCorrect = false;
		String e = sc.next();
		char c = '@';
		char c1 = '.';
		// 检查电子邮箱格式
		if (e.contains(String.valueOf(c)) && e.contains(String.valueOf(c1)) && e.indexOf(c) != 0 && e.indexOf(c1) != 0
				&& e.indexOf(c) != -1 && e.indexOf(c1) != -1 && e.indexOf(c1) > e.indexOf(c)) {
			emailCorrect = true;
			System.out.println("设置成功！您输入的邮箱名是" + e);
		} else {
			System.out.println("邮箱名无效！");
		}
	}

}
