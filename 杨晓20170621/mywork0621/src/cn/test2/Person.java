package cn.test2;

/**
 * ����
 */
public class Person {

	private String name;// ����

	/**
	 * �޲ι��췽��
	 */
	public Person() {
		super();
	}

	/**
	 * �вι��췽��
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * set��get����
	 */
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
