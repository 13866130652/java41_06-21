package homework6_21_1;

/*
 * 2)����дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯����
 * ��Student����дPerson����public void speak()�����������С������ο��Գɼ����ò������;
 * ��Student����������public void think()���������˵��������˼������;
 */
public class Student extends Person {
	public Student() {
	}

	public Student(String name) {
		super(name);
	}

	// ��д�����speak()����
	public void speak() {
		System.out.println("��ʦ��"+getName()+"˵��С������ο��Գɼ����Ĳ����");
	}

	// ˼���ķ���
	public void think() {
		System.out.println("��˵����"+getName()+"��������˼����");
	}
}
