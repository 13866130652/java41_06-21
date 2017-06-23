package cn.test4;

/**
 * 检验邮箱格式是否正确
 */
public class EmailFormat {
	public static boolean emailFormat(String Email) {
		if (Email.indexOf("@") != -1 && Email.indexOf(".") != -1) {// 检验邮箱中包含“@”“.”
			// 判断两个字符是不是都只出现了一次
			if (Email.indexOf("@") == Email.lastIndexOf("@") && Email.indexOf("@") == Email.lastIndexOf("@")) {
				if (Email.indexOf("@") != 0 && Email.indexOf(".") != 0) {// 检验邮箱中“@”“.”不在首位
					// 检验邮箱中“@”“.”不在末位
					if (!(Email.endsWith("@") || Email.endsWith("."))) {
						// 检验@符号必须在.符号之前，并且@和.符号中间至少包含一个字符。
						if (Email.indexOf(".") - Email.indexOf("@") > 1) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * main（）
	 */
	public static void main(String[] args) {
		String Email = "1011157554@qq.com";
		System.out.println(Email + ":格式是否正确：" + emailFormat(Email));
	}
}
