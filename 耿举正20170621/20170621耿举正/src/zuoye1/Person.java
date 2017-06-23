package zuoye1;

/**
 * 2)、使用封装、继承和多态实现如下需求：(10分) 2.1)、创建Person类，属性有private String
 * name,并编写getter和setter方法，编写父 类无参构造函数和带参构造函数，方法有public void speak()，输出”咿咿呀呀！”
 * 
 * 
 * @author Administrator
 *
 */
public class Person {
	// 私有化属性
	private String name;

	// 构造方法
	// 无参
	public Person() {

	}

	// 有参
	public Person(String name) {
		super();
		this.name = name;
	}

	// set get 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("咿咿呀呀！");
	}
}
