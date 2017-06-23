package cn.bdqa;

public class Person {
	private String name;// 姓名
	// 无参构造方法

	public Person() {

	}

	// 带参构造方法
	private Person(String name) {
		super();
		this.name = name;
	}

	// 公共get set 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 说的方法
	public void speak() {
		System.out.println("咿咿呀呀！");
	}
}
