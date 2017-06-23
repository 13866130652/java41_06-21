package cn.bdqa;

import java.util.Scanner;

//邮箱正确与否判断
public class StringTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的邮箱：");
		String st = input.next();
		// index@出现的下表-1表示不存在
		int index = st.lastIndexOf("@");
		// index1为.出现的下表-1表示不存在
		int index1 = st.lastIndexOf(".");
		if ((index != -1) && (index1 != -1) && (index1 > index + 1)
				&& (index != 0) && (index1 != st.length() - 1)) {
			System.out.println("邮箱输入合法！");
		} else {
			System.out.println("邮箱输入不合法！");
		}
	}
}
