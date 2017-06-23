package cn.test2;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Student("²¨²¨");
		p1.speak();
		if (p1 instanceof Student) {
			((Student) p1).think();
		}
	}

}
