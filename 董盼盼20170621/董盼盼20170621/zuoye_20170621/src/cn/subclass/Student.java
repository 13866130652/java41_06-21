package cn.subclass;

import cn.sup.Person;

public class Student extends Person {
	// 无参构造方法
	public Student() {

	}

	// 有参构造方法
	public Student(String name) {
		super(name);
	}

	// 重写父类的speak()方法
	public void speak() {
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}

	// 子类特有的think()方法,表示思考
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
