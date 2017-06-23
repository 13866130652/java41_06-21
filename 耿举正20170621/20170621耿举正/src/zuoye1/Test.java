package zuoye1;

/**
 * 在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和 think()方法。
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("张三");
		st.speak();
		st.think();
	}

}
