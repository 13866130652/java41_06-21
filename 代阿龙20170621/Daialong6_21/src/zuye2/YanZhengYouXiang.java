package zuye2;

import java.util.Scanner;

//��֤�����Ƿ�Ϸ�
public class YanZhengYouXiang {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������䣺");
		String st = input.next();
		// �������ַ�����ת�����ַ�����
		char[] ch = st.toCharArray();
		int a = 0, b = 0;
		// �����ַ����飬�ҳ�������@��.�ĸ���
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '@') {
				a++;
			}
			if (ch[i] == '.') {
				b++;
			}
		}
		// ��֤�����Ƿ�Ϸ�
		// @��.ֻ��һ���������ڿ�ͷ�ͽ�β��@������.֮ǰ���м�������һ���ַ�
		if (a == 1 && b == 1 && (st.indexOf("@") != 0) && (st.indexOf(".") != 0)
				&& (st.lastIndexOf("@") != st.length() - 1) && ((st.lastIndexOf(".") != st.length() - 1))
				&& (st.indexOf("@") + 1) < (st.indexOf("."))) {
			System.out.println("��������Ϸ�!");
		} else {
			System.out.println("�������䲻�Ϸ�!");
		}
	}

}
