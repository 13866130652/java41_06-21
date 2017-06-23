package _0621;
//Student类继承Person类
public  class Student extends Person {
	public Student(){
		
	}
	public Student(String name) {
		super(name);
	}
	//说的方法
	public void speak(){
		System.out.println(getName()+":小样，这次考试成绩考得错嘛！");
	}
	//思考的方法
   public void think(){
	   System.out.println(getName()+":别说话，认真思考！");
   }

}
