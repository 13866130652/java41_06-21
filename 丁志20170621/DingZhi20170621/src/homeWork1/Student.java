package homeWork1;

/**
 * 1)、创建Student类，设置属性name,age,gender,className
 * 创建Students.xml文档用来保存学员姓名、年龄、性别、所在班级。使用DOM4J解析students.xml文档，
 * 并把解析出来的学员信息保存到ArrayList<Student>集合中，在控制台打印出所有学员信息。（10分）
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
