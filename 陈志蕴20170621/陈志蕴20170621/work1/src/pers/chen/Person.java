package pers.chen;

/**
 * ����Person�࣬�����в���private String name,дgetter��setter��������д��
 * ���޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
 * 
 * @author ��־��
 * @date 20170622
 */
public class Person {
	private String name;// ����

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

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
