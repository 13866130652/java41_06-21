package date0621.title2;

public class Student extends Person {
	// 构造方法
	Student() {
	}

	Student(String name) {
		super(name);
	}

	// 重写speak
	@Override
	public void speak() {
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}

	// 特有方法think
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
