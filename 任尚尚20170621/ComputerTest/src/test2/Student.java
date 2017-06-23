package test2;
/**
 * @author 任尚尚
 * 编写Student类继承自Person类
 */
public class Student extends Person {
	//构造方法
	public Student() {
		super();
	}
	public Student(String name) {
		super(name);
	}
	
	//说话方法
	public void speak(){
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}
	
	//思考方法
	public void think(){
		System.out.println("别说话，认真思考！");
	}
	
	
	
}
