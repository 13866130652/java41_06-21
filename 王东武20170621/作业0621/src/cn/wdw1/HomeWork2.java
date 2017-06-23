package cn.wdw1;
/**
 * 	
 */
import java.util.Scanner;

public class HomeWork2 {
	public static boolean emailFormat(String Email) {
		if (Email.indexOf("@") != -1 && Email.indexOf(".") != -1) {// 检验邮箱中包含“@”“.”
			if (Email.indexOf("@") != 0 && Email.indexOf(".") != 0) {// 检验邮箱中“@”“.”不在首位
				// 检验邮箱中“@”“.”不在末位
				if (!(Email.endsWith("@") || Email.endsWith("."))) {
					// 检验@符号必须在.符号之前，并且@和.符号中间至少包含一个字符。
					if (Email.indexOf(".") - Email.indexOf("@") >= 1) {
						return true;
					}
				}
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入邮箱：");
		String A=sc.next();
		System.out.println("格式是否正确：" + emailFormat(A));
	}
}


