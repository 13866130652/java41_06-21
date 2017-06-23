package cn.bdqn;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("当前线程是：" + t.getName());
		t.setName("MyJavaThread");
		System.out.println("当前线程名字是：" + t.getName());
	}
}
