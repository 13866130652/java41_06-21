package cn.zuoye2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		Scanner sc = new Scanner(System.in);
		boolean answer = true;
		while (answer) {
			System.out.print("������������������");
			if (sd.useFul(sc.next())) {
				answer = false;
				System.out.println("��������Ϸ���");
			} else {
				System.out.println("�������벻�Ϸ���");
			}
		}

	}

}
