package cn.bdqn.firsttest_4;

import java.util.Scanner;

public class HeFaYouXiang {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean emailCorrect = false;// 标记email是否正确
		boolean emailCorrect1 = false;// 标记email是否正确

		System.out.println("*************欢迎进入邮箱判定系统************");
		System.out.println("请输入你的邮箱：");
		String email = sc.next();
		// 检查电子邮箱是否正确
		if (email.contains("@") && email.contains(".")) {
			emailCorrect = true;
		} else {
			emailCorrect = false;
		}
		// 判断邮箱的@与.的位置是否合法
		if (email.indexOf('@') != 0 && (email.lastIndexOf("@") != email.length() - 1)
				&& (email.lastIndexOf(".") != email.length() - 1) && (email.indexOf('.') > email.indexOf('@') + 1)) {
			emailCorrect1 = true;
		} else {
			emailCorrect1 = false;
		}
		if (emailCorrect && emailCorrect1) {
			System.out.println("邮箱合法！");
		} else {
			System.out.println("邮箱不合法！");
		}

	}
}
