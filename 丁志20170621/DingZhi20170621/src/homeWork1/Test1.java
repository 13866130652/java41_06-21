package homeWork1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1)������Student�࣬��������name,age,gender,className
 * ����Students.xml�ĵ���������ѧԱ���������䡢�Ա����ڰ༶��ʹ��DOM4J����students.xml�ĵ���
 * ���ѽ���������ѧԱ��Ϣ���浽ArrayList<Student>�����У��ڿ���̨��ӡ������ѧԱ��Ϣ����10�֣�
 */
public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student("������", 18, '��', "�Ϸʿƺ�Java43");
		Student s2 = new Student("�Ծ���", 18, 'Ů', "�Ϸʿƺ�Java43");
		Student s3 = new Student("�����", 18, '��', "�Ϸʿƺ�Java43");
		Student s4 = new Student("������", 18, '��', "�Ϸʿƺ�Java43");
		s1.getName();
		CreateDemo cd = new CreateDemo();
		cd.createdir("D:\\homework20170621");
		cd.createf("D:\\homework20170621\\Students.xml");
		Map<String, Student> map = new LinkedHashMap<String, Student>();
		map.put("������ͳ", s1);
		map.put("AVŮ��", s2);
		map.put("�����ʥ", s3);
		map.put("˫������", s4);
		System.out.println(map);
	}
}
