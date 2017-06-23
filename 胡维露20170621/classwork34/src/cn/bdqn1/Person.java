package cn.bdqn1;

public class Person {
	// 姓名
	private String name;

	// 无参构造方法
	public Person() {

	}

	// 有参构造方法
	public Person(String name) {
		this.name = name;
	}

	// setter与getter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 方法
	public void speak() {
		System.out.println("咿咿呀呀！");
	}

}
