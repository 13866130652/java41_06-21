package cn.work;

import java.util.Scanner;

public class YouXiang {

	public static void main(String[] args) {
		System.out.println("�����������ַ");
		String st = (new Scanner(System.in)).next();
		// �ж��Ƿ���@�͡�
		if (st.contains("@") && st.contains(".")) {
			// �ж�@�͡��Ƿ��ڵ�һ�����һλ
			if (st.charAt(0) != '@' && st.charAt(0) != '.' && st.charAt(st.length() - 1) != '@'
					&& st.charAt(st.length() - 1) != '.') {
				// �жϡ��Ƿ���@ǰ��λ
				if ((st.indexOf('.') > (st.indexOf('@') + 1)) && st.endsWith(".com")
						&& (st.indexOf('.') == st.lastIndexOf('.')) && (st.indexOf('@') == st.lastIndexOf('@'))) {
					System.out.println("����Ϸ�");
				} else {
					System.out.println("���䲻�Ϸ�");
				}
			} else {
				System.out.println("���䲻�Ϸ�");
			}
		} else {
			System.out.println("���䲻�Ϸ�");
		}
	}

}
