package cn.wdw1;
/**
 * 	
 */
import java.util.Scanner;

public class HomeWork2 {
	public static boolean emailFormat(String Email) {
		if (Email.indexOf("@") != -1 && Email.indexOf(".") != -1) {// ���������а�����@����.��
			if (Email.indexOf("@") != 0 && Email.indexOf(".") != 0) {// ���������С�@����.��������λ
				// ���������С�@����.������ĩλ
				if (!(Email.endsWith("@") || Email.endsWith("."))) {
					// ����@���ű�����.����֮ǰ������@��.�����м����ٰ���һ���ַ���
					if (Email.indexOf(".") - Email.indexOf("@") >= 1) {
						return true;
					}
				}
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������䣺");
		String A=sc.next();
		System.out.println("��ʽ�Ƿ���ȷ��" + emailFormat(A));
	}
}


