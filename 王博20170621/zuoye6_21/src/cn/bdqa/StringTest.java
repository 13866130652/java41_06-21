package cn.bdqa;

import java.util.Scanner;

//������ȷ����ж�
public class StringTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������������䣺");
		String st = input.next();
		// index@���ֵ��±�-1��ʾ������
		int index = st.lastIndexOf("@");
		// index1Ϊ.���ֵ��±�-1��ʾ������
		int index1 = st.lastIndexOf(".");
		if ((index != -1) && (index1 != -1) && (index1 > index + 1)
				&& (index != 0) && (index1 != st.length() - 1)) {
			System.out.println("��������Ϸ���");
		} else {
			System.out.println("�������벻�Ϸ���");
		}
	}
}
