package test2;
/**
 * @author ������
 * ����Person��
 */
public class Person {
	//����
	private String name;
	
	//getter&&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//���췽��
	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	
	//˵������
	public void speak(){
		System.out.println("����ѽѽ��");
	}
	
}
