package zuoye2;

//����Student�̳и���Person��
public class Student extends Person {

	// �вι��췽��
	public Student(String name) {
		super();
	}

	// �޲ι��췽��
	public Student() {

	}

	// ��д���෽��
	@Override
	public void speak() {
		super.speak();
		System.out.println("С������ο��Գɼ����ò����");
	}

	// ����˼������
	public void think() {
		System.out.println("��˵��������˼����");
	}
}
