package date0621.title2;

public class Person {
	// ���췽��
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	// ����name
	private String name;

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ����speak
	public void speak() {
		System.out.println("����ѽѽ!");
	}

}
