package cn.bdqa;

public class Person {
	private String name;// ����
	// �޲ι��췽��

	public Person() {

	}

	// ���ι��췽��
	private Person(String name) {
		super();
		this.name = name;
	}

	// ����get set ����
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
