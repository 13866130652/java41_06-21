package practice3;

import java.util.Scanner;

/**
 * �ӿ���̨����������֤�Ƿ�Ϸ� �������@���ź͡�.�����ŵ���������λ�����һλ��@��.֮ǰ���м�����Ҫ��һ���ַ�
 *
 */
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String st = sc.next();
		if (st.contains("@") && st.contains(".")//
				&& st.indexOf("@") != 0 && st.indexOf(".") != 0//
				&& st.indexOf("@") != st.length() - 1 && st.indexOf(".") != st.length() - 1//
				&& st.indexOf(".") - st.indexOf("@") > 1) {
			System.out.println("�Ϸ�");
		} else {
			System.out.println("�Ƿ�");
		}

	}

}
