package cn.wdw;
/**
 * 2)��ʹ�÷�װ���̳кͶ�̬ʵ����������(10��)
2.1)������Person�࣬������private String name,����дgetter��setter��������д��		���޲ι��캯���ʹ��ι��캯����������public void speak()�����������ѽѽ����
2.2)����дStudent��̳���Person�࣬��д�����޲ι��캯���ʹ��ι��캯������		Student����дPerson����public void speak()�����������С������ο��Գɼ�����		�������;��Student����������public void think()���������˵��������˼������;
2.3)���ڲ�����Test��main()�����д���������󣬲�ʹ������������speak()������		think()������
����ϸ��
  A).��ȷ����Person���� 2��
  B).��ȷ����Student���� 2��
  C).������д����speak()���� 2 �� ,������ȷ��չ�Լ������еķ���2��
  D).���������࣬��ȷ����������󣬲�����speak()������think()���� 2��
 * @author Administrator
 *
 */
public class Person {
private String name;//����
public Person(){
	
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
public void speak(){
	System.out.println("��ѽӴѽ");
}
}
