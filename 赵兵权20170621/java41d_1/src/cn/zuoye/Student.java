package cn.zuoye;

public class Student extends Person {
	// 子类Student的无参构造方法
	public Student() {

	}

	// 子类Student的有参构造方法
	public Student(String name) {
		super(name);
	}

	// 重写父类speak方法
	public void speak() {
		System.out.println("小样，这次考试成绩考得不错嘛");
	}

	// 新增方法think
	public void think() {
		System.out.println("别说话，认真思考");
	}
}
