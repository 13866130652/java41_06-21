package cn.bdqn1;

public class Person {
	private String name;//����
	//�޲ι��췽��
	public Person() {
	}
    //�вι��췽��
	public Person(String name) {
		this.name = name;
	}
	//getter����
	public String getName() {
		return name;
	}
	//setter����
	public void setName(String name) {
		this.name = name;
	}
	//�������
	public void speak(){
		System.out.println("����ѽѽ��");
	}
	
}
