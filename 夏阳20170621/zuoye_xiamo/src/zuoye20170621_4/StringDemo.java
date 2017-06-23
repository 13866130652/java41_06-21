package zuoye20170621_4;

import java.util.Scanner;

//邮箱类
public class StringDemo {
	public static boolean xm(String a) {
		// 用int类型对象接收第一个@下标
		int at = a.indexOf("@");
		// 用int类型对象接收最后一个@下标
		int at1 = a.lastIndexOf("@");
		// 用int类型对象接收第一个.下标
		int dian = a.indexOf(".");
		// 用int类型对象接收最后一个.下标
		int dian1 = a.lastIndexOf(".");
		boolean g = false, g1 = false, g2 = false, gz = false;
		// 判断第一个@与第一个.是否存在
		if (at != -1 && dian != -1) {
			g = true;
		}
		// 判断第一个@与第一个.是否在第一个位置，最后一个@与最后一个.是都在最后一个位置
		if (at != 0 && dian != 0 && at1 != a.length() - 1 && dian1 != a.length() - 1) {
			g1 = true;
		}
		// 判断最后出现的@与第一个.之间是否存在字符
		if (at1 + 1 < dian) {
			g2 = true;
		}
		// 最后是否都正确
		if (g && g1 && g2) {
			gz = true;
		}
		return gz;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		do {
			flag = false;
			System.out.print("请输入邮箱:");
			String yx = sc.next();
			if (xm(yx)) {
				System.out.println("您输入的邮箱合法！");
			} else {
				System.out.println("您输入的邮箱不合法，请重新输入:");
				flag = true;
			}
		} while (flag);
	}

}
