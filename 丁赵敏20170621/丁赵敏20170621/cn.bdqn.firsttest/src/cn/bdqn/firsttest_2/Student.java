/**
 * 
 */
package cn.bdqn.firsttest_2;

/**
 * @author Administrator
 * @�̳л���Person
 * @ʵ���Լ������з���������д���෽��
 */
public class Student extends Person {
	// �в��޲ι���
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("С������ο��Գɼ����ò����");
	}

	public void think() {
		System.out.println("��˵��������˼����");
	}
}
