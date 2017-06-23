package cn.bdqn.firsttest_2;

public class Person {
	private String name;// 姓名
	// 有参无参构造

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	// set和get方法
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
