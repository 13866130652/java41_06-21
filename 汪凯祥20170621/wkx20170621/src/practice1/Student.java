package practice1;

/**
 * ��дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯����
 * 
 * ��Student����дPerson����public void speak()�����������С������ο��Գɼ�����
 * 
 * �������;��Student����������public void think()���������˵��������˼������;
 *
 */
public class Student extends Person {
	private String studentID;// ѧ��

	// ���췽��
	public Student() {
	}

	public Student(String name, String studentID) {
		super(name);
		this.studentID = studentID;
	}

	public void speak() {
		System.out.println("С������ο��Գɼ����ò����");
	}

	public void think() {
		System.out.println("��˵��������˼����");
	}
}
