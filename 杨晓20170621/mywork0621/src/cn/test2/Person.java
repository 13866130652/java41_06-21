package cn.test2;

/**
 * 人类
 */
public class Person {

	private String name;// 姓名

	/**
	 * 无参构造方法
	 */
	public Person() {
		super();
	}

	/**
	 * 有参构造方法
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * set、get方法
	 */
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
