package cn.work;

public class Person {
	private String name;// ����

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
	//speak���෽��
	public void speak(){
		System.out.println("����ѽѽ");
	}
}
