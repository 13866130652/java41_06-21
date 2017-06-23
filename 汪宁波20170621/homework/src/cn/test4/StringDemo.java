package cn.test4;

import java.util.Scanner;

public class StringDemo {
	public static boolean isRight(String y) {
		// 声明首尾下标
		int d1 = y.indexOf("@");
		int d11 = y.lastIndexOf("@");
		int d2 = y.indexOf(".");
		int d22 = y.lastIndexOf(".");
		boolean f1 = false, f2 = false, f3 = false, f = false;
		// 判断"@""."是否存在
		if (d1 != -1 && d2 != -1) {
			f1 = true;
		}
		// 判断是否在首尾位置
		if ((d1 != 0 && d11 != y.length() - 1) && (d2 != 0 && d22 != y.length() - 1)) {
			f2 = true;
		}
		// 判断@是否在.前面
		if (d22 > d1 + 1) {
			f3 = true;
		}
		// 判断三个条件是否满足
		if (f1 && f2 && f3) {
			f = true;
		}
		return f;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		do {
			System.out.println("请输入邮箱名：");
			String yx = input.next();
			if (isRight(yx)) {
				System.out.println("邮箱合法");
			} else {
				System.out.println("不合法");
			}
			flag = isRight(yx);
		} while (!flag);

	}
}
