package disiti;

import java.util.Scanner;

public class YouXiang {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("����������:");
		String st = Sc.next();
		if(st.contains("@") && st.contains(".")){
			if((st.indexOf("@") != 0 && st.indexOf(".") != 0) && (st.indexOf("@") != st.length()-1 && st.indexOf(".") != st.length()-1)){
				if((st.indexOf("@")+1) < st.indexOf(".") ){
					System.out.println("��������Ϸ�");
				} else {
					System.out.println("������@�ڡ�֮ǰ�����м�������һ���ַ�");
				}
			}else{
				System.out.println("������@�͡������ڵ�һ�������һ��λ��");
			}
		}else{
			System.out.println("����������@�͡�");
		}
	}

}
