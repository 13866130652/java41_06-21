package cn.work;
//ѧ����
public class Student extends Person {
	public Student() {
	}

	public Student(String name) {
		super(name);
	}
	//������д���෽��
	@Override
	public void speak(){
		System.out.println("С������ο��Գɼ����ò���");
	}
	
	public void think(){
		System.out.println("��˵��������˼��");
	}
}
