package cn.test2;

/**
 * ²âÊÔÀà
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Student("ÕÅÈı");
		p.speak();
		if (p instanceof Student) {
			((Student) p).think();
		}
	}
}
