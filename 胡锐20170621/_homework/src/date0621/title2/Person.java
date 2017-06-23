package date0621.title2;

public class Person {
	// 构造方法
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	// 属性name
	private String name;

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 方法speak
	public void speak() {
		System.out.println("咿咿呀呀!");
	}

}
