package cn.work;

import java.util.Scanner;

public class YouXiang {

	public static void main(String[] args) {
		System.out.println("请输入邮箱地址");
		String st = (new Scanner(System.in)).next();
		// 判断是否有@和。
		if (st.contains("@") && st.contains(".")) {
			// 判断@和。是否在第一和最后一位
			if (st.charAt(0) != '@' && st.charAt(0) != '.' && st.charAt(st.length() - 1) != '@'
					&& st.charAt(st.length() - 1) != '.') {
				// 判断。是否在@前两位
				if ((st.indexOf('.') > (st.indexOf('@') + 1)) && st.endsWith(".com")
						&& (st.indexOf('.') == st.lastIndexOf('.')) && (st.indexOf('@') == st.lastIndexOf('@'))) {
					System.out.println("输入合法");
				} else {
					System.out.println("邮箱不合法");
				}
			} else {
				System.out.println("邮箱不合法");
			}
		} else {
			System.out.println("邮箱不合法");
		}
	}

}
