package one;

public class Test {

	public static void main(String[] args) {
		Person p = new Student();// 父类引用指向子类对象
		p.speak();// 调用重写方法
		// 将父类引用转化为子类类型后调用子类特有方法
		Student s = (Student) p;
		s.think();
	}

}
