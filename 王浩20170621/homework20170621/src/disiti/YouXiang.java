package disiti;

import java.util.Scanner;

public class YouXiang {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("请输入邮箱:");
		String st = Sc.next();
		if(st.contains("@") && st.contains(".")){
			if((st.indexOf("@") != 0 && st.indexOf(".") != 0) && (st.indexOf("@") != st.length()-1 && st.indexOf(".") != st.length()-1)){
				if((st.indexOf("@")+1) < st.indexOf(".") ){
					System.out.println("输入邮箱合法");
				} else {
					System.out.println("邮箱中@在。之前，且中间至少有一个字符");
				}
			}else{
				System.out.println("邮箱中@和。不能在第一个和最后一个位置");
			}
		}else{
			System.out.println("邮箱必须包含@和。");
		}
	}

}
