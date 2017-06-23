package zuye2;

import java.util.Scanner;

//验证邮箱是否合法
public class YanZhengYouXiang {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String st = input.next();
		// 把输入字符串的转换成字符数组
		char[] ch = st.toCharArray();
		int a = 0, b = 0;
		// 遍历字符数组，找出数组中@和.的个数
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '@') {
				a++;
			}
			if (ch[i] == '.') {
				b++;
			}
		}
		// 验证邮箱是否合法
		// @和.只有一个，不能在开头和结尾，@必须在.之前且中间至少有一个字符
		if (a == 1 && b == 1 && (st.indexOf("@") != 0) && (st.indexOf(".") != 0)
				&& (st.lastIndexOf("@") != st.length() - 1) && ((st.lastIndexOf(".") != st.length() - 1))
				&& (st.indexOf("@") + 1) < (st.indexOf("."))) {
			System.out.println("输入邮箱合法!");
		} else {
			System.out.println("输入邮箱不合法!");
		}
	}

}
