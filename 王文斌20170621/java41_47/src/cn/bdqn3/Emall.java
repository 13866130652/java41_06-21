package cn.bdqn3;

import java.util.Scanner;

public class Emall {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������һ�������ƣ�");
		String st = in.next();

		if (st.indexOf(".") != -1 && st.indexOf("@") != -1 && st.indexOf(".") != 0 && st.indexOf("@") != 0
				&& st.lastIndexOf(".") != st.length() - 1 && st.lastIndexOf("@") != st.length() - 1
				&& (st.lastIndexOf(".") - st.lastIndexOf("@")) >= 2) {
			System.out.println("����������ȷ������Ϊ��" + st);
		} else {
			System.out.println("�����������");
		}
	}

}
