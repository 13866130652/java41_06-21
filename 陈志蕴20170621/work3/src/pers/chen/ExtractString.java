package pers.chen;

import java.util.Scanner;

/**
 * 验证邮箱是否合法
 * 
 * @author chen
 * @date 20170622
 */
public class ExtractString {
	public static Scanner sc = new Scanner(System.in);

	public static boolean isLegalID() {
		System.out.print("请输入邮箱地址：");
		String mail = sc.next();
		// 判断@ . 是否存在且不在首尾
		if (mail.indexOf('@') != -1 && mail.indexOf('@') != 0 && mail.indexOf('.') != -1 && mail.indexOf('.') != 0) {
			// 判断@ . 是否在末位
			if (mail.lastIndexOf('@') != (mail.length() - 1) && mail.lastIndexOf('.') != (mail.length() - 1)) {
				// 判断@ 是否在 . 之前，且中间至少存在一个字符
				if (mail.lastIndexOf('.') > (mail.lastIndexOf('@') + 1)) {
					System.out.println("邮箱地址合法！");
				} else {
					System.out.println("邮箱地址不合法！");
				}
			} else {
				System.out.println("邮箱地址不合法！");
			}
		} else {
			System.out.println("邮箱地址不合法！");
		}
		return false;

	}

	public static void main(String[] args) {
		isLegalID();
	}

}
