package thread;

public class Two extends Thread {
	// ��дrun��������
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "��������:" + i);// �����ǰ�߳�����
			if (i == 0) {
				System.out.println(Thread.currentThread().getName() + "����ͣ");
				Thread.yield();// ��ͣ�߳�
			}
			try {
				Thread.sleep(1000);// ʹ�߳�����1000����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "�������!");
	}

}
