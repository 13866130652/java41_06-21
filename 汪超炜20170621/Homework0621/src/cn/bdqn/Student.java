package cn.bdqn;
/**
 * 
 * @author �����
 *��дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯������
 *Student����дPerson����public void speak()�����������С������ο��Գɼ�����
 *�������;��Student����������public void think()���������˵��������˼������;
 *
 */
//Student��̳�Person��
public class Student extends Person {
	//�޲ι���
	public Student(){
	}
	//�вι���
	public Student(String name){
		super(name);
	}
	//��д����speak����
	public void speak(){
		super.speak();
		System.out.println("С������ο��Գɼ����ò����");
	}
	//����Student�෽��
	public void think(){
		System.out.println("��˵��������˼����");
	}
}
