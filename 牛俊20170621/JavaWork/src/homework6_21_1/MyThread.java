package homework6_21_1;

//Thread��ĳ��÷���
public class MyThread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		for (int i = 0; i < 100; i++) {
			System.out.println(t.getName()+":"+i);
			System.out.println("�߳�����3�룺");
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
		t.setPriority(MAX_PRIORITY);//�������ȼ���߼�-10
		t.setPriority(MIN_PRIORITY);//�������ȼ���ͼ�-1
		t.start();
		t1.start();
	}
}
