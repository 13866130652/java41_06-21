package cn.zuoye2;

public class StringDemo {
	// 判断输入的邮箱格式是否合法
	public static boolean useFul(String emial) {
		int a = emial.indexOf('@');
		int b = emial.indexOf('.');
		int c = emial.lastIndexOf('@');
		int d = emial.lastIndexOf('.');
		// 判断邮箱是否同时包含@和.
		if (emial.contains("@") && emial.contains(".")) {
			// 邮箱的@和.符号不能出现在第一个位置，且@和.不能出现在最后一个
			if (((a != 0) && (b != 0)) && ((c != emial.length()) && (d != emial.length()))) {
				// @需在.之前，并且之间必须至少有一个字符
				if (a + 2 <= b) {
					return true;
				}
			}
		}
		return false;
	}
}
