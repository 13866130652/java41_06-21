package cn.dqs2;

/*
 * ����Person�࣬������private String name,����дgetter��setter������
 * ��д�����޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
 */
public class Person {

	private String name;// ����

	// �޲ι���
	public Person() {
	}

	// �вι���
	public Person(String name) {
		super();
		this.name = name;
	}

	// getter��setter����
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
