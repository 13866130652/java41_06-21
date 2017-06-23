package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// ����̶߳���
		Thread t = new Thread();
		Thread t1 = new Thread(new One());
		Thread t2 = new Thread(new One(), "�߳�1");
		Thread t3 = new Thread(new Two(), "�߳�2");
		t.run();// ִ��rnu()����
		// �����߳����ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		// ����߳����ȼ�
		System.out.println(t1.getName() + "�߳����ȼ���" + t1.getPriority());
		System.out.println(t2.getName() + "�߳����ȼ���" + t2.getPriority());
		t1.start();// �����߳�
		// �ȴ��߳�t1������ɺ������������߳�
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();// �����߳�1
		t3.start();// �����߳�2
		// ��ʾ�̻߳״̬
		System.out.println(t1.getName() + "�̻߳״̬��" + t1.isAlive());
		System.out.println(t2.getName() + "�̻߳״̬��" + t2.isAlive());
	}

}
