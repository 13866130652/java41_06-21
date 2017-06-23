package practice1;

/**
 * 在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和
 *
 * think()方法。
 *
 */
public class Test {

	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Student();
		p.speak();
		Student s = (Student) p;
		s.think();
	}

}
