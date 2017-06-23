package cn.bdqn1;

public class Test {
	public static void main(String[] args) {
		// 子类重写父类方法，使用多态可以调用，并且是调用子类重写的方法
		Person p = new Student();
		p.speak();
		// 子类特有方法，使用多态无法调用
		Student st = new Student();
		st.think();

	}

}
