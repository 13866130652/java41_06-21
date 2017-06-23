package zuoye2;

//父类Person类
public class Person {

	private String name;// 名字

	// set,get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 有参构造方法
	public Person(String name) {
		super();
		this.name = name;
	}

	// 无参构造方法
	public Person() {

	}

	// 说话的方法
	public void speak() {
		System.out.println("咿咿呀呀！");
	}

}
