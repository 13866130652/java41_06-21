package cn.subclass;

import cn.sup.Person;

public class Student extends Person {
	// �޲ι��췽��
	public Student() {

	}

	// �вι��췽��
	public Student(String name) {
		super(name);
	}

	// ��д�����speak()����
	public void speak() {
		System.out.println("С������ο��Գɼ����ò����");
	}

	// �������е�think()����,��ʾ˼��
	public void think() {
		System.out.println("��˵��������˼����");
	}
}
