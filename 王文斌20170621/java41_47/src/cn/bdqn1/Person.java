package cn.bdqn1;

public class Person {
	private String name;//姓名
	//无参构造方法
	public Person() {
	}
    //有参构造方法
	public Person(String name) {
		this.name = name;
	}
	//getter方法
	public String getName() {
		return name;
	}
	//setter方法
	public void setName(String name) {
		this.name = name;
	}
	//输出方法
	public void speak(){
		System.out.println("咿咿呀呀！");
	}
	
}
