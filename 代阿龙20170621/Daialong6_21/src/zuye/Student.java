package zuye;

//����Student��̳�Person��
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
		super.speak();
		System.out.println("С������ο��Գɼ����ò����");
	}

	// think()����
	public void think() {
		System.out.println("��˵��������˼��!");
	}
}
