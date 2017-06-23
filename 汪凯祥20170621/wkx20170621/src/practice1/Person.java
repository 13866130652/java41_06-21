package practice1;

/**
 * 创建Person类，属性有private String name,并编写getter和setter方法，编写父
 * 
 * 类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
 *
 */
public class Person {
	private String name;// 姓名

	// 构造方法
	public Person() {
	}

	public Person(String name) {
		this.name = name;

	}

	// getter和setter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("咿咿呀呀！");
	}
}
