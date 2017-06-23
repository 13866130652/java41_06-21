package zuoye20170621_2;

//创建Person类
public class Person {
	private String name;// 姓名

	// 无参构造方法
	public Person() {
	}

	// 带参构造方法
	public Person(String name) {
		super();
		this.name = name;
	}

	// get方法
	public String getName() {
		return name;
	}

	// set方法
	public void setName(String name) {
		this.name = name;
	}

	// 说的方法
	public void speak() {
		System.out.println("咿咿呀呀！");
	}
}
