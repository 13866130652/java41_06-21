package one;

//Student��̳�Person��
public class Student extends Person {
	// ���췽��
	public Student(String name) {
		super(name);
	}

	public Student() {
	}

	// ��д���෽��
	public void speak() {
		System.out.println("С������ο��Կ��ò����");
	}

	// �������з���
	public void think() {
		System.out.println("��˵��������˼����");
	}
}
