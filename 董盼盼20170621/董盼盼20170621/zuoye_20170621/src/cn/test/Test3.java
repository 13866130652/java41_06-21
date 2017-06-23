package cn.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的邮箱：");
		String st = input.next();
		int index = st.indexOf("@");// 获得首次出现@的位置
		int index1 = st.indexOf(".");// 获得首次出现.的位置
		int index2 = st.lastIndexOf("@"); // 获得最后出现@的位置
		int index3 = st.lastIndexOf(".");// 获得最后出现.的位置
		if (index != -1 && index1 != -1) {// 判断包含@和.符号
			if (index != 0 && index1 != 0 && index + 1 < index1) {// 邮箱名中的@和.符号不能在首位且@必须在.之前并且@和.符号中间至少包含一个字符!
				if (index2 != st.length() && index3 != st.length()) {// 邮箱名中@和.符号不能在最后一个
					System.out.println("邮箱名完全正确！");
				} else {
					System.out.println("邮箱名中@和.符号不能在最后一个 ");
				}
			} else {
				System.out.println("邮箱名中的@和.符号不能在首位且@必须在.之前并且@和.符号中间至少包含一个字符!");
			}
		} else {
			System.out.println("邮箱名必须包含@和.符号!");
		}
	}

}
