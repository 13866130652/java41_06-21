package _0621;
//Student��̳�Person��
public  class Student extends Person {
	public Student(){
		
	}
	public Student(String name) {
		super(name);
	}
	//˵�ķ���
	public void speak(){
		System.out.println(getName()+":С������ο��Գɼ����ô��");
	}
	//˼���ķ���
   public void think(){
	   System.out.println(getName()+":��˵��������˼����");
   }

}
