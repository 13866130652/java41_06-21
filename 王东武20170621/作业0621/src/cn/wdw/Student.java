package cn.wdw;

public class Student extends Person {
	/**
	 * �޲ι��췽��
	 */
	public Student() {
		super();
	}

	/**
	 * �вι��췽��
	 */
	public Student(String name) {
		super(name);
	}
	public void speak() {
		super.speak();
		System.out.println("С������ο��Գɼ����ò����");
	}

	public void think() {
		System.out.println("��˵��������˼����");
	}
}

