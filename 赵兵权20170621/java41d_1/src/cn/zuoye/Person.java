package cn.zuoye;

//����Person��
public class Person {
	private String name;// ����
	// �޲ι��췽��

	public Person() {

	}

	// �вι��췽��
	public Person(String name) {
		this.name = name;
	}

	// �ṩsetter/getter����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ����speak
	public void speak() {
		System.out.println("����ѽѽ");
	}
}
