package zuoye4;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		boolean emailCorrect = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入邮箱名：");
		String eamil = sc.next();
		// 是否有@和. @是否在.前面
		if (eamil.lastIndexOf('@') != -1 && eamil.lastIndexOf('.') > eamil.lastIndexOf('@')) {
			// @和.是否在第一位或最后一位
			if (eamil.indexOf('@') != 0 && eamil.lastIndexOf('.') != eamil.length() - 1) {
				// @和.之间最少有一位字符
				if (eamil.lastIndexOf('.') - eamil.lastIndexOf('@') > 1) {
					emailCorrect = true;
					System.out.println("进入邮箱！");
				} else {
					System.out.println("@和.之间至少有一个字符");
				}
			} else {
				System.out.println("@和.不能再第一位或者最后一位");
			}
		} else {
			System.out.println("请确认是否有@和.并且@要在.前面");
		}

	}

}
