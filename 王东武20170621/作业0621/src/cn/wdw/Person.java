package cn.wdw;
/**
 * 2)、使用封装、继承和多态实现如下需求：(10分)
2.1)、创建Person类，属性有private String name,并编写getter和setter方法，编写父		类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
2.2)、编写Student类继承自Person类，编写子类无参构造函数和带参构造函数，在		Student类重写Person父类public void speak()方法，输出”小样，这次考试成绩考得		不错嘛！”;在Student类新增方法public void think()，输出”别说话，认真思考！”;
2.3)、在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和		think()方法。
评分细则：
  A).正确创建Person父类 2分
  B).正确创建Student子类 2分
  C).子类重写父类speak()方法 2 分 ,子类正确扩展自己所特有的方法2分
  D).创建测试类，正确创建子类对象，并调用speak()方法和think()方法 2分
 * @author Administrator
 *
 */
public class Person {
private String name;//名字
public Person(){
	
}
public Person(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void speak(){
	System.out.println("咿呀哟呀");
}
}
