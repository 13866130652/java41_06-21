package zuoye20170621_2;

//������
public class Test {

	public static void main(String[] args) {
		// ͨ�����ഴ������ָ���������
		Person a = new Student();
		// ͨ������������speak().think()����
		a.speak();
		// ǿ��ת��
		((Student) a).think();
	}

}
