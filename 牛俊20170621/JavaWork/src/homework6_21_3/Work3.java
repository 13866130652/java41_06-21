package homework6_21_3;

import java.util.Scanner;

/*
 * 使用String提取字符串，从控制台输入一个邮箱，验证邮箱是否合法？
 * 注：合法的邮箱格式是XXX@XX.com
 * 要求：1.要求邮箱必须包括"@"字符和"."字符
 *      2.邮箱的@和.符号不能在第一个位置，且@和.不能在最后一个
 *      3.邮箱的@符号必须在.之前，且@符号和.符号中间至少要有一个字符。
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入邮箱号：");
		String mail=input.next();
		boolean flag=false;//标记是否存在@和.字符
		boolean flag1=false;//标记@和.是否在第一个位置或者最后一个
		boolean flag2=false;//标记@是否在.之前，且@符号和.符号之间是否存在至少有一个字符
		if(mail.contains("@")&&mail.contains(".")){
			flag=true;
		}
		if(mail.charAt(0)!='@'&&mail.charAt(0)!='.'&&mail.lastIndexOf("@")!=mail.length()-1&&mail.lastIndexOf(".")!=mail.length()-1){
			flag1=true;
		}
		//截取最后一次@和.符号出现中间所包含的元素
		if(mail.lastIndexOf("@")<mail.lastIndexOf(".")&&(mail.substring(mail.lastIndexOf("@"), mail.lastIndexOf("."))).length()!=1){
			flag2=true;
		}
		if(flag&&flag1&&flag2){
			System.out.println("邮箱登录成功！");
		}else{
			System.out.println("邮箱格式错误，登录失败！");
		}
	}
}
