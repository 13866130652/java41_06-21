package cn.zuoye;

public class Test {

	public static void main(String[] args) {
		Person p = new Student();// 多态创建对象
		p.speak();
		Student s = (Student) p;
		s.think();

	}

}
