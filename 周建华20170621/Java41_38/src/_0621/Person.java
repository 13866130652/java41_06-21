package _0621;

public class Person {
	private String name;//姓名
	//无参方法
	public Person(){
		
	}
	//带参方法
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

	public void speak(){
		System.out.println(getName()+":咿咿呀呀");
	}
	

}
