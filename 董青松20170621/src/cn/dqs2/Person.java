package cn.dqs2;

/*
 * 创建Person类，属性有private String name,并编写getter和setter方法，
 * 编写父类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
 */
public class Person {

	private String name;// 姓名

	// 无参构造
	public Person() {
	}

	// 有参构造
	public Person(String name) {
		super();
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
