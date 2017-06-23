package cn.zuoye;

//创建Person类
public class Person {
	private String name;// 姓名
	// 无参构造方法

	public Person() {

	}

	// 有参构造方法
	public Person(String name) {
		this.name = name;
	}

	// 提供setter/getter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 方法speak
	public void speak() {
		System.out.println("咿咿呀呀");
	}
}
