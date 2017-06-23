package cn.bdqn;

public class RunnableTest implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		RunnableTest r1 = new RunnableTest();
		Thread t = new Thread(r1);
		RunnableTest r2 = new RunnableTest();
		Thread t1 = new Thread(r2);
		t.start();
		t1.start();

	}
}
