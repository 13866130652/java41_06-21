package cn.zuoye;

public class Test {

	public static void main(String[] args) {
		Person p = new Student();// ��̬��������
		p.speak();
		Student s = (Student) p;
		s.think();

	}

}
