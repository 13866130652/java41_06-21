package cn.dqs2;

/*
 * 在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和think()方法。
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
