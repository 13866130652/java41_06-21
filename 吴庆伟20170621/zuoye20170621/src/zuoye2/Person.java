package zuoye2;

//����Person��
public class Person {

	private String name;// ����

	// set,get����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// �вι��췽��
	public Person(String name) {
		super();
		this.name = name;
	}

	// �޲ι��췽��
	public Person() {

	}

	// ˵���ķ���
	public void speak() {
		System.out.println("����ѽѽ��");
	}

}
