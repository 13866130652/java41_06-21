package q2;

public class Person {
	// 属性
	private String name;

	// 无参构造函数
	public Person() {
	}

	// 带参构造函数
	public Person(String name) {
		this.name = name;
	}

	// 进行封装
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 方法有public void speak()，输出”咿咿呀呀！”
	public void speak() {
		System.out.println("咿咿呀呀！");
	}
}
