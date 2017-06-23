package cn.dqs4;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		boolean demo1 = false;
		boolean demo2 = false;
		boolean demo3 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的邮箱：");
		String email = sc.next();
		// 验证电子邮箱必须包含@和.符号
		if ((email.contains("@")) && (email.contains("."))) {
			demo1 = true;
		} else {
			System.out.println("邮箱错误!");
		}
		// 验证电子邮箱@和.符号不能在第一个位置，并且@和.符号不能在最后一个
		if ((email.indexOf("@")) != 0 && (email.indexOf("@")) != (email.length() - 1) && (email.indexOf(".")) != 0
				&& (email.indexOf(".")) != (email.length() - 1)) {
			demo2 = true;
		} else {
			System.out.println("邮箱错误!");
		}
		// 验证电子邮箱@符号必须在.符号之前，并且@和.符号中间至少包含一个字符
		if (email.indexOf(".") > (email.indexOf("@") + 1)) {
			demo3 = true;
		} else {
			System.out.println("邮箱错误!");
		}

		if (demo1 && demo2 && demo3) {
			System.out.println("邮箱正确");
		} else {
			System.out.println("邮箱错误！");
		}
	}

}
