package date0621.title2;

public class Student extends Person {
	// ���췽��
	Student() {
	}

	Student(String name) {
		super(name);
	}

	// ��дspeak
	@Override
	public void speak() {
		System.out.println("С������ο��Գɼ����ò����");
	}

	// ���з���think
	public void think() {
		System.out.println("��˵��������˼����");
	}
}
