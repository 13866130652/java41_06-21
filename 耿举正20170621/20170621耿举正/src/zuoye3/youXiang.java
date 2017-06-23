package zuoye3;

import java.util.Scanner;

public class youXiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入正确的邮箱地址！");

		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		if (email.indexOf("@") == email.lastIndexOf("@") && email.indexOf(".") == email.lastIndexOf(".")) {
			if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
				// 检查有没有@和.
				if ((email.indexOf("@") != 0 && email.indexOf(".") != 0)
						&& (email.lastIndexOf("@") != email.length() - 1
								&& email.lastIndexOf(".") != email.length() - 1)) {
					// 检验邮箱中“@”“.”不在首位 检验邮箱中“@”“.”不在末位

					// 检验@符号必须在.符号之前，并且@和.符号中间至少包含一个字符。
					if (email.indexOf(".") - email.indexOf("@") > 1) {
						System.out.println("输入合法");
					} else {
						System.out.println("邮箱@和.前后顺序间隔错误！请重新输入");
					}

				} else {
					System.out.println("邮箱输入@ .位置错误@和.不在头不在尾！请重新输入");
				}
			} else {
				System.out.println("邮箱@和.可能没有输入齐全！请重新输入");
			}
		} else {
			System.out.println("邮箱存在多个@ .！请重新输入");
		}
	}
}