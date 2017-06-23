package cn.work1;

public class Student extends Person{
	private String classroom;
	private int score;
	
	public Student(){
	}
	
	
	private Student(String classroom, int score) {
		super();
		this.classroom = classroom;
		this.score = score;
	}


	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public void speak () {
		System.out.println("小样，这次考试成绩考得不错嘛!");;
	}
	public void think(){
		System.out.println("别说话，认真思考!");
	}
	
}
