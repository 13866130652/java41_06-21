package cn.work;
//学生类
public class Student extends Person {
	public Student() {
	}

	public Student(String name) {
		super(name);
	}
	//子类重写父类方法
	@Override
	public void speak(){
		System.out.println("小样，这次考试成绩考得不错");
	}
	
	public void think(){
		System.out.println("别说话，认真思考");
	}
}
