package one;

public class Person {
	private String name;// ����
	// ���췽��

	public Person(String name) {
		this.name = name;
	}

	public Person() {

	}

	// set��get����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("����ѽѽ");
	}
}
