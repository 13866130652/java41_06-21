package practice1;

/**
 * �ڲ�����Test��main()�����д���������󣬲�ʹ������������speak()������
 *
 * think()������
 *
 */
public class Test {

	public static void main(String[] args) {
		// ����Person����
		Person p = new Student();
		p.speak();
		Student s = (Student) p;
		s.think();
	}

}
