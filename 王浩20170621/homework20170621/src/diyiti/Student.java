package diyiti;

public class Student extends Person{
	public Student(){
	}
	public Student(String name){	
		super(name);
	}
	
	public void speak(){
		System.out.println("小样，这次考试考的不错");
	}
	public void think(){
		System.out.println("别说话，认真思考");
	}
}
