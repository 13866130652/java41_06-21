package cn.test2;

/**
 * ������
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Student("����");
		p.speak();
		if (p instanceof Student) {
			((Student) p).think();
		}
	}
}
