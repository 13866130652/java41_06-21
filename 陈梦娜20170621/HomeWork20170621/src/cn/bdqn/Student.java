package cn.bdqn;

//学生Student类继承Person类
public class Student extends Person {

	// 构造方法
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	// 重写父类speak()方法
	public void speak() {
		System.out.println("小样，这次考试成绩考的不错嘛！");
	}

	// 学生类特有方法
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
