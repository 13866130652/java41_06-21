package _0621;

public class Person {
	private String name;//����
	//�޲η���
	public Person(){
		
	}
	//���η���
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

	public void speak(){
		System.out.println(getName()+":����ѽѽ");
	}
	

}
