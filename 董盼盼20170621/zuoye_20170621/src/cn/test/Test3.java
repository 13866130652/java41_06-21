package cn.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������������䣺");
		String st = input.next();
		int index = st.indexOf("@");// ����״γ���@��λ��
		int index1 = st.indexOf(".");// ����״γ���.��λ��
		int index2 = st.lastIndexOf("@"); // ���������@��λ��
		int index3 = st.lastIndexOf(".");// ���������.��λ��
		if (index != -1 && index1 != -1) {// �жϰ���@��.����
			if (index != 0 && index1 != 0 && index + 1 < index1) {// �������е�@��.���Ų�������λ��@������.֮ǰ����@��.�����м����ٰ���һ���ַ�!
				if (index2 != st.length() && index3 != st.length()) {// ��������@��.���Ų��������һ��
					System.out.println("��������ȫ��ȷ��");
				} else {
					System.out.println("��������@��.���Ų��������һ�� ");
				}
			} else {
				System.out.println("�������е�@��.���Ų�������λ��@������.֮ǰ����@��.�����м����ٰ���һ���ַ�!");
			}
		} else {
			System.out.println("�������������@��.����!");
		}
	}

}
