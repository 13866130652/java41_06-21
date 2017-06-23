package cn.bdqn;

import java.util.Scanner;

//验证邮箱是否合法
public class EmailDemo {

	public static void main(String[] args) {
		boolean email = false;// 标记邮箱是否正确
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("请输入邮箱名：");
			String name = input.next();
			int index = name.lastIndexOf(".");
			if (name.indexOf('@') != -1 && name.indexOf('@') != 0//
					&& name.indexOf('.') != -1 && name.indexOf('.') != 0 //
					&& name.indexOf('.') > name.indexOf('@') + 1//
					&& name.lastIndexOf('.') != name.length() - 1 && //
					name.lastIndexOf('@') != name.length() - 1) {
				email = true;
				System.out.println("邮箱正确");
				break;
			} else {
				System.out.println("邮箱无效");
			}
		}
	}
}
