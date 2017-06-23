package cn.bdqn;

public class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

	public static void main(String[] args) {
		MyRunnable myrunnable = new MyRunnable();
		// Thread myThread=new Thread(myrunnable);
		Thread myThread = new Thread(myrunnable);
		myThread.start();
	}

}
