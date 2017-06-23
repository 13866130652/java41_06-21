package string;

import java.util.Scanner;

/**
 * 接收输入的电子邮箱地址，并验证其正确性
 * 
 * @author lgd
 */
public class E_mail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的Email地址(输入exit结束)：");
		String in = null;
		while (true) {
			in = input.next().trim();
			// 电子邮箱必须包含@和.符号
			if (in.contains(".") && in.contains("@")) {
				// 电子邮箱@和.符号不能在第一个位置，并且@和.符号不能在最后一个
				if ((in.indexOf(".") != 0 && in.indexOf(".") != in.length() - 1)
						&& (in.indexOf("@") != 0 && in.indexOf("@") != in.length() - 1)) {
					// 电子邮箱@符号必须在.符号之前，并且@和.符号中间至少包含一个字符
					if (in.indexOf(".") > in.indexOf("@") + 1) {
						System.out.println("地址输入正确！您输入的地址是：" + in);
						input.close();
						break;
					}
				}
			}
			if (in.equalsIgnoreCase("exit")) {
				System.out.println("谢谢使用！");
				input.close();
				break;
			}
			System.out.println("地址输入错误！请重新输入(输入exit结束)：");
		}
	}
}
