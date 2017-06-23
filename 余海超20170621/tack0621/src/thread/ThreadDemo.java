package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// 获得线程对象
		Thread t = new Thread();
		Thread t1 = new Thread(new One());
		Thread t2 = new Thread(new One(), "线程1");
		Thread t3 = new Thread(new Two(), "线程2");
		t.run();// 执行rnu()方法
		// 更改线程优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		// 输出线程优先级
		System.out.println(t1.getName() + "线程优先级：" + t1.getPriority());
		System.out.println(t2.getName() + "线程优先级：" + t2.getPriority());
		t1.start();// 启动线程
		// 等待线程t1运行完成后再运行其他线程
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();// 启动线程1
		t3.start();// 启动线程2
		// 显示线程活动状态
		System.out.println(t1.getName() + "线程活动状态：" + t1.isAlive());
		System.out.println(t2.getName() + "线程活动状态：" + t2.isAlive());
	}

}
