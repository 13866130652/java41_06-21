package zuoye1;

/**
 * ��дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯������ Student����дPerson����public void
 * speak()�����������С������ο��Գɼ����� �������;��Student����������public void
 * think()���������˵��������˼������;
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
	// ���췽��
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("С������ο��Գɼ����� �����");
	}

	public void think() {
		System.out.println("��˵��������˼����");
	}
}
