package one;

//Student类继承Person类
public class Student extends Person {
	// 构造方法
	public Student(String name) {
		super(name);
	}

	public Student() {
	}

	// 重写父类方法
	public void speak() {
		System.out.println("小样，这次考试考得不错嘛！");
	}

	// 子类特有方法
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
