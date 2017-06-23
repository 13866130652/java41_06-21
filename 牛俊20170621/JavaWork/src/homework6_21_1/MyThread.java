package homework6_21_1;

//Thread类的常用方法
public class MyThread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		for (int i = 0; i < 100; i++) {
			System.out.println(t.getName()+":"+i);
			System.out.println("线程休眠3秒：");
			try {
				t.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		t.setPriority(MAX_PRIORITY);//设置优先级最高级-10
		t.setPriority(MIN_PRIORITY);//设置优先级最低级-1
		t.start();
		t1.start();
	}
}
