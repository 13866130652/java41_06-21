package practice1;

/**
 * ����Person�࣬������private String name,����дgetter��setter��������д��
 * 
 * ���޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
 *
 */
public class Person {
	private String name;// ����

	// ���췽��
	public Person() {
	}

	public Person(String name) {
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
