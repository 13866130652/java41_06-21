package cn.bdqn3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Judge j = new Judge();
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÓÊÏäÃû£º");
		String name = input.next();
		j.judgeEmail(name);

	}

}
