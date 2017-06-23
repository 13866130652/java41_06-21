package cn.work;

public class Person {
	private String name;// 姓名

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//speak父类方法
	public void speak(){
		System.out.println("咿咿呀呀");
	}
}
