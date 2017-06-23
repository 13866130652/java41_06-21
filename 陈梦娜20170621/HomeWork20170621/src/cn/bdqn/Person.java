package cn.bdqn;

//Person类
public class Person {
	// 私有化属性
	private String name;

	// 构造方法
	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	// set/get方法
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
