/**
 * 
 */
package cn.bdqn.firsttest_2;

/**
 * @author Administrator
 * @继承基类Person
 * @实现自己的特有方法并且重写基类方法
 */
public class Student extends Person {
	// 有参无参构造
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("小样，这次考试成绩考得不错嘛！");
	}

	public void think() {
		System.out.println("别说话，认真思考！");
	}
}
