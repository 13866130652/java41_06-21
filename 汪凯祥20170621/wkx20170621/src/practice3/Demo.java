package practice3;

import java.util.Scanner;

/**
 * 从控制台输入邮箱验证是否合法 必须包含@符号和“.”符号但不能是首位和最后一位，@在.之前且中间至少要有一个字符
 *
 */
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String st = sc.next();
		if (st.contains("@") && st.contains(".")//
				&& st.indexOf("@") != 0 && st.indexOf(".") != 0//
				&& st.indexOf("@") != st.length() - 1 && st.indexOf(".") != st.length() - 1//
				&& st.indexOf(".") - st.indexOf("@") > 1) {
			System.out.println("合法");
		} else {
			System.out.println("非法");
		}

	}

}
