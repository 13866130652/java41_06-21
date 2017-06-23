package cn.test2;

public class Student extends Person {
	public Student() {
		super();
	}

	public Student(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("小样，这次考试成绩考的不错嘛！");
	}

	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
