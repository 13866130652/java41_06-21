package cn.dqs2;

/*
 * ��дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯����
 * ��Student����дPerson����public void speak()�����������С����
 * ��ο��Գɼ����ò������;��Student����������public void think()��
 * �������˵��������˼������;
 */
public class Student extends Person {

	// �޲ι���
	public Student() {
	}

	// �вι���
	public Student(String name) {
		super(name);
	}

	public void speak() {
		super.speak();
		System.out.println("С���� ��ο��Գɼ����ò����");
	}

	public void think() {
		System.out.println("��˵��������˼����");
	}

}
