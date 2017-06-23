package cn.bdqn2;
/**
 * 汪超炜
 * 检查邮箱地址是否合格
 * 
 * 
 */
import java.util.Scanner;

public class EmailTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入邮箱:");
		//用字符串接收输入的信息
		String st=sc.next();
		//找到@的位置
		int a=st.indexOf('@');
		//找到.的位置
		int b=st.indexOf('.');
		//查看最后一个.的位置
		int c=st.lastIndexOf('.');
		if(a<1||b<1||a>b||(c==st.length()-1)){
			System.out.println("邮箱名不合格！");
		}else if(b-a>1){
			System.out.println("邮箱名合格！");
		}else{
			System.out.println("邮箱名不合格！");
		}
	}

}
