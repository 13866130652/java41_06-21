package cn.dqs2;

/*
 * �ڲ�����Test��main()�����д���������󣬲�ʹ������������speak()������think()������
 */
public class Test {

	public static void main(String[] args) {
		Person p = new Student("Lily");
		p.speak();
		if (p instanceof Student) {
			((Student) p).think();
		}

		// Student s = new Student("Marry");
		// s.speak();
		// s.think();
	}

}
