package test4;

import java.util.Scanner;
/**
 * @author 任尚尚
 * 验证邮箱是否合法
 */
public class EmailNameTest {
	//判断字符串是否包含"@"和"."
	public static boolean isExists(String name){
		if(name.contains("@")&&name.contains(".")){
			return true;
		}
		return false;
	}
	
	//判断字符串中"@"和"."的位置
	public static boolean testPlace(String name){
		if(name.indexOf("@")!=0&&name.indexOf(".")!=0&&name.indexOf("@")!=(name.length()-1)&&name.indexOf(".")!=(name.length()-1)){
			return true;
		}
		return false;
	}
	
	//判断字符串中"@"和"."的顺序
	public static boolean testOrder(String name){
		if(name.indexOf("@")<name.indexOf(".")-1){
			return true;
		}
		return false;
	}
	
	//判断字符串最后是否为".com"
	public static boolean testWords(String name){
		if(name.substring(name.indexOf(".")).equals(".com")){
			return true;
		}
		return false;
	}
	
	//main方法
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入邮箱名称:");
		String name = input.next();
		if(isExists(name)&&testPlace(name)&&testOrder(name)&&testWords(name)){
			System.out.println("该邮箱合法!");
		} else {
			System.out.println("该邮箱不合法!");
		}
	}
}