package test2;
/**
 * @author ������
 * ��дStudent��̳���Person��
 */
public class Student extends Person {
	//���췽��
	public Student() {
		super();
	}
	public Student(String name) {
		super(name);
	}
	
	//˵������
	public void speak(){
		System.out.println("С������ο��Գɼ����ò����");
	}
	
	//˼������
	public void think(){
		System.out.println("��˵��������˼����");
	}
	
	
	
}
