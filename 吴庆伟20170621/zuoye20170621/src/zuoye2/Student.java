package zuoye2;

//子类Student继承父类Person类
public class Student extends Person {

	// 有参构造方法
	public Student(String name) {
		super();
	}

	// 无参构造方法
	public Student() {

	}

	// 重写父类方法
	@Override
	public void speak() {
		super.speak();
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}

	// 新增思考方法
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
