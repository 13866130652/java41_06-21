package homework6_21_1;

/*
 * 2)、编写Student类继承自Person类，编写子类无参构造函数和带参构造函数，
 * 在Student类重写Person父类public void speak()方法，输出”小样，这次考试成绩考得不错嘛！”;
 * 在Student类新增方法public void think()，输出”别说话，认真思考！”;
 */
public class Student extends Person {
	public Student() {
	}

	public Student(String name) {
		super(name);
	}

	// 重写父类的speak()方法
	public void speak() {
		System.out.println("老师对"+getName()+"说：小样，这次考试成绩考的不错嘛！");
	}

	// 思考的方法
	public void think() {
		System.out.println("别说话，"+getName()+"正在认真思考！");
	}
}
