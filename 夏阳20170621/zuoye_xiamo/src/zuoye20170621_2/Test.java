package zuoye20170621_2;

//测试类
public class Test {

	public static void main(String[] args) {
		// 通过父类创建对象指向子类对象
		Person a = new Student();
		// 通过子类对象调用speak().think()方法
		a.speak();
		// 强制转换
		((Student) a).think();
	}

}
