package q2;

public class Person {
	// ����
	private String name;

	// �޲ι��캯��
	public Person() {
	}

	// ���ι��캯��
	public Person(String name) {
		this.name = name;
	}

	// ���з�װ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ������public void speak()�����������ѽѽ����
	public void speak() {
		System.out.println("����ѽѽ��");
	}
}
