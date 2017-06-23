package thread;

public class Two extends Thread {
	// 重写run（）方法
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "正在运行:" + i);// 输出当前线程名称
			if (i == 0) {
				System.out.println(Thread.currentThread().getName() + "已暂停");
				Thread.yield();// 暂停线程
			}
			try {
				Thread.sleep(1000);// 使线程休眠1000毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "运行完成!");
	}

}
