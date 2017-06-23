package cn.test2;

/**
 * 学生类
 */
public class Student extends Person {

	/**
	 * 无参构造方法
	 */
	public Student() {
		super();
	}

	/**
	 * 有参构造方法
	 */
	public Student(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}

	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
