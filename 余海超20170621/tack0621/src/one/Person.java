package one;

public class Person {
	private String name;// 姓名
	// 构造方法

	public Person(String name) {
		this.name = name;
	}

	public Person() {

	}

	// set、get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("咿咿呀呀");
	}
}
