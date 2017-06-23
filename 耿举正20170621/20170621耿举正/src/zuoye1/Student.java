package zuoye1;

/**
 * 编写Student类继承自Person类，编写子类无参构造函数和带参构造函数，在 Student类重写Person父类public void
 * speak()方法，输出”小样，这次考试成绩考得 不错嘛！”;在Student类新增方法public void
 * think()，输出”别说话，认真思考！”;
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
	// 构造方法
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("小样，这次考试成绩考得 不错嘛！");
	}

	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
