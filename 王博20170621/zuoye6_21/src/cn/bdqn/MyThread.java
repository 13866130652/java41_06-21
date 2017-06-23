package cn.bdqn;

public class MyThread extends Thread {
	// ÷ÿ–¥run∑Ω∑®
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		// thread.start();
		MyThread thread1 = new MyThread();
		// thread1.start();
		MyThread thread2 = new MyThread();
		// thread2.start();
		thread.run();
		thread1.run();
		thread2.run();
	}
}
