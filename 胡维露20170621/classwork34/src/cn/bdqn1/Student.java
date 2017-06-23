package cn.bdqn1;

public final class Student extends Person {
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("小样,这次考试成绩考得不错嘛!");
	}

	public void think() {
		System.out.println("别说话,认真思考!");
	}

}
