package homework6_21_1;

/*
 * 使用封装、继承和多态实现如下需求：(10分)
 * 2.1)、创建Person类，属性有private String name,并编写getter和setter方法，
 * 编写父类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
 * 
 * 2.2)、编写Student类继承自Person类，编写子类无参构造函数和带参构造函数，
 * 在Student类重写Person父类public void speak()方法，输出”小样，这次考试成绩考得不错嘛！”;
 * 在Student类新增方法public void think()，输出”别说话，认真思考！”;
 * 
 * 2.3)、在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和		think()方法。
 */
public class Work1Test {
	public static void main(String[] args) {
		Student st=new Student("康康");
		st.speak();
		st.think();
	}
}
