package cn.bdqn;
/**
 * 
 * @author 汪超炜
 *在测试类Test的main()方法中创建子类对象，并使用子类对象调用speak()方法和
 *think()方法。
 *
 *
 */
//Test类测试Student类
public class TestDemo {

	public static void main(String[] args) {
		//创建子类对象
		Student st=new Student();
		//调用speak和think方法
		st.speak();
		st.think();
	}

}
