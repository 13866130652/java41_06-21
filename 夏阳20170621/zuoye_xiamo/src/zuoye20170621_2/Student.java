package zuoye20170621_2;

//Student类继承了Person类
public class Student extends Person {
	// 无参构造方法
	public Student() {
		super();
	}

	// 带参构造方法
	public Student(String name) {
		super(name);
	}

	// 重写父类方法
	public void speak() {
		System.out.println("小样，这次考试成绩考得不错嘛!");
	}

	// 想的方法
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
