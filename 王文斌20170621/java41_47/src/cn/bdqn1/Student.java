package cn.bdqn1;

public class Student extends Person{
	//无参构造方法
	public Student() {
		
	}
	//有参构造方法
	public Student(String name) {
		super(name);
	}
	//重写方法父类speak()方法
	public void speak(){
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}
	public void think(){
		System.out.println("别说话，认真思考！");
	}
}
