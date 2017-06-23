package zuoye4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("请输入邮箱名：");
		String e = m.next();
		// 获取邮箱中@的位置
		int index1 = e.indexOf("@");
		// 获取邮箱中.的位置
		int index2 = e.indexOf(".");
		// 电子邮箱@和.符号不能在第一个位置，并且@和.符号不能在最后一个位置
		if (e.lastIndexOf("@") != 0 && e.lastIndexOf(".") != 0) {
			if (e.lastIndexOf("@") != e.length() || e.lastIndexOf(".") != e.length()) {
				String s = e.substring(e.lastIndexOf("@"), e.lastIndexOf("."));
				if (s.length() != 1) {
					// 正确验证电子邮箱@符号必须在.符号之前
					if (index1 != -1 && index2 > index1) {
						System.out.println("邮箱格式正确！");
					}
				}
			}
		} else {
			System.out.println("邮箱吧格式不正确！");
		}
	}

}
