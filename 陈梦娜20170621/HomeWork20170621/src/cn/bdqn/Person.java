package cn.bdqn;

//Person��
public class Person {
	// ˽�л�����
	private String name;

	// ���췽��
	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	// set/get����
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
