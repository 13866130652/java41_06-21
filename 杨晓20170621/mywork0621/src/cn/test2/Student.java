package cn.test2;

/**
 * ѧ����
 */
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

	@Override
	public void speak() {
		System.out.println("С������ο��Գɼ����ò����");
	}

	public void think() {
		System.out.println("��˵��������˼����");
	}
}
