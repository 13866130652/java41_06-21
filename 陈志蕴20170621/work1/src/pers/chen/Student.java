package pers.chen;

/**
 * ��дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯������ Student����дPerson����public void
 * speak()�����������С������ο��Գɼ����� �������;��Student����������public void
 * think()���������˵��������˼������;
 * 
 * @author ��־��
 * @date 20170622
 */
public class Student extends Person {

	public Student() {

	}

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
