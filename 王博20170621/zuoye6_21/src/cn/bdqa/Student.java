package cn.bdqa;

//2.1)、创建Person类，属性有private String name,并编写getter和setter方法，
//编写父		类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
//2.2)、编写Student类继承自Person类，
//编写子类无参构造函数和带参构造函数，
//在		Student类重写Person父类public void speak()方法，
//输出”小样，这次考试成绩考得		不错嘛！”;
//在Student类新增方法public void think()，输出”别说话，认真思考！”;
//2.3)、在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和		think()方法。

public class Student extends Person {
	// 重写父类说的方法
	public void speak() {
		System.out.println("小样，这次考试成绩考的不错嘛！");
	}

	// 思考的方法
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
