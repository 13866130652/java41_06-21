package cn.bdqn;

//ѧ��Student��̳�Person��
public class Student extends Person {

	// ���췽��
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	// ��д����speak()����
	public void speak() {
		System.out.println("С������ο��Գɼ����Ĳ����");
	}

	// ѧ�������з���
	public void think() {
		System.out.println("��˵��������˼����");
	}
}
