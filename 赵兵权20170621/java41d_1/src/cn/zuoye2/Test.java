package cn.zuoye2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		Scanner sc = new Scanner(System.in);
		boolean answer = true;
		while (answer) {
			System.out.print("请输入您的邮箱名：");
			if (sd.useFul(sc.next())) {
				answer = false;
				System.out.println("邮箱输入合法！");
			} else {
				System.out.println("邮箱输入不合法！");
			}
		}

	}

}
