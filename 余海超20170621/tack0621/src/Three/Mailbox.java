package Three;

import java.util.Scanner;

public class Mailbox {

	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		System.out.print("输出邮箱号：");
		String s = sb.next();
		if (s.indexOf('.') > 0 && s.indexOf('@') > 0) {// 判断'.'与'@'是否存在且是否在第一位
			if (s.indexOf('.') != s.length() - 1 && s.indexOf('@') != s.length() - 1) {// 判断'.'与'@'是否在最后一位
				if (s.indexOf('.') - s.indexOf('@') > 1) {// 判断'@'是否在'.'之前且是否间隔一个以上字符
					System.out.println("您输入的邮箱格式正确！");
					return;
				}
			}
		}
		System.out.println("您输入的邮箱格式不正确！");
	}

}
