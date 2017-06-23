package homeWork1;

/**
 * 1)������Student�࣬��������name,age,gender,className
 * ����Students.xml�ĵ���������ѧԱ���������䡢�Ա����ڰ༶��ʹ��DOM4J����students.xml�ĵ���
 * ���ѽ���������ѧԱ��Ϣ���浽ArrayList<Student>�����У��ڿ���̨��ӡ������ѧԱ��Ϣ����10�֣�
 */
public class Student {
	private String name;
	private int age;
	private char gender;
	private String className;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", className=" + className + "]";
	}

	public Student(String name, int age, char gender, String className) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.className = className;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
