package one;

public class Test {

	public static void main(String[] args) {
		Person p = new Student();// ��������ָ���������
		p.speak();// ������д����
		// ����������ת��Ϊ�������ͺ�����������з���
		Student s = (Student) p;
		s.think();
	}

}
