package cn.bdqn.firsttest_2;

public class Person {
	private String name;// ����
	// �в��޲ι���

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	// set��get����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("����ѽѽ��");
	}
}
