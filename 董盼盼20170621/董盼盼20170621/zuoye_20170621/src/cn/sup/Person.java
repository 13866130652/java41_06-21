package cn.sup;

public class Person {
	private String name;// ����

	// �޲ι��췽��
	public Person() {

	}

	// �вι��췽��
	public Person(String name) {
		this.name = name;
	}

	// get��set����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ˵�ķ���
	public void speak() {
		System.out.println("����ѽѽ��");
	}
}
