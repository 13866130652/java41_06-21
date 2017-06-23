package cn.bdqn3;

import java.util.Scanner;

public class Emall {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入一邮箱名称：");
		String st = in.next();

		if (st.indexOf(".") != -1 && st.indexOf("@") != -1 && st.indexOf(".") != 0 && st.indexOf("@") != 0
				&& st.lastIndexOf(".") != st.length() - 1 && st.lastIndexOf("@") != st.length() - 1
				&& (st.lastIndexOf(".") - st.lastIndexOf("@")) >= 2) {
			System.out.println("邮箱输入正确，邮箱为：" + st);
		} else {
			System.out.println("邮箱输入错误！");
		}
	}

}
