package zuoye20170621_2;

//����Person��
public class Person {
	private String name;// ����

	// �޲ι��췽��
	public Person() {
	}

	// ���ι��췽��
	public Person(String name) {
		super();
		this.name = name;
	}

	// get����
	public String getName() {
		return name;
	}

	// set����
	public void setName(String name) {
		this.name = name;
	}

	// ˵�ķ���
	public void speak() {
		System.out.println("����ѽѽ��");
	}
}
