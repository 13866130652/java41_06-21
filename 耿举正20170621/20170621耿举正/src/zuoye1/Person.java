package zuoye1;

/**
 * 2)��ʹ�÷�װ���̳кͶ�̬ʵ����������(10��) 2.1)������Person�࣬������private String
 * name,����дgetter��setter��������д�� ���޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
 * 
 * 
 * @author Administrator
 *
 */
public class Person {
	// ˽�л�����
	private String name;

	// ���췽��
	// �޲�
	public Person() {

	}

	// �в�
	public Person(String name) {
		super();
		this.name = name;
	}

	// set get ����
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
