package thread;

//�߳���̳�Thread��
public class One extends Thread {
	// ��дrun��������
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "��������:" + i);// �����ǰ�߳�����
			try {
				Thread.sleep(1000);// ʹ�߳�����1000����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "�������!");
	}
}
