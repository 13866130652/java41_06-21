package homeWork2;

/**
 * 2)��ʹ�÷�װ���̳кͶ�̬ʵ����������(10��) 2.1)������Person�࣬������private String
 * name,����дgetter��setter��������д�� ���޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
 * 2.2)����дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯������ Student����дPerson����public void
 * speak()�����������С������ο��Գɼ����� �������;��Student����������public void
 * think()���������˵��������˼������; 2.3)���ڲ�����Test��main()�����д���������󣬲�ʹ������������speak()������
 * think()������
 */
public class Student extends Person {
	// ���췽��
	public Student() {
		super();
	}

	public Student(String name) {
		super(name);
	}

	// ��д���෽��
	public void speak() {
		System.out.println("С��,��ο��Գɼ����ò�����!");
	}

	// ��������
	public void think() {
		System.out.println("��˵��,����˼��!");
	}
}
