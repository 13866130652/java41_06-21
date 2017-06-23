package zuye;

//创建Person类
public class Person {
	// 创建属性
	private String name;

	// 无参构造方法
	public Person() {

	}

	// 有参构造方法
	public Person(String name) {
		this.name = name;
	}

	// set/get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// speak()方法
	public void speak() {
		System.out.println("咿咿呀呀！");
	}
}
