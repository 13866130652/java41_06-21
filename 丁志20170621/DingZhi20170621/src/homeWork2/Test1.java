package homeWork2;

/**
 * 2)��ʹ�÷�װ���̳кͶ�̬ʵ����������(10��) 2.1)������Person�࣬������private String
 * name,����дgetter��setter��������д�� ���޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
 * 2.2)����дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯������ Student����дPerson����public void
 * speak()�����������С������ο��Գɼ����� �������;��Student����������public void
 * think()���������˵��������˼������; 2.3)���ڲ�����Test��main()�����д���������󣬲�ʹ������������speak()������
 * think()������
 */
public class Test1 {
	public static void main(String[] args) {
		Student stu = new Student("����");
		System.out.print(stu.getName() + "˵:");
		stu.speak();
		stu.think();

	}
}
