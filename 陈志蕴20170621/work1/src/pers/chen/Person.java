package pers.chen;

/**
 * 创建Person类，属性有并编private String name,写getter和setter方法，编写父
 * 类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
 * 
 * @author 陈志蕴
 * @date 20170622
 */
public class Person {
	private String name;// 姓名

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

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
