package cn.zuoye;

public class Student extends Person {
	// ����Student���޲ι��췽��
	public Student() {

	}

	// ����Student���вι��췽��
	public Student(String name) {
		super(name);
	}

	// ��д����speak����
	public void speak() {
		System.out.println("С������ο��Գɼ����ò�����");
	}

	// ��������think
	public void think() {
		System.out.println("��˵��������˼��");
	}
}
