package zuoye20170621_2;

//Student��̳���Person��
public class Student extends Person {
	// �޲ι��췽��
	public Student() {
		super();
	}

	// ���ι��췽��
	public Student(String name) {
		super(name);
	}

	// ��д���෽��
	public void speak() {
		System.out.println("С������ο��Գɼ����ò�����!");
	}

	// ��ķ���
	public void think() {
		System.out.println("��˵��������˼����");
	}
}
