package homeWork1;

import java.io.File;

public class CreateDemo {

	// ����Ŀ¼����
	public void createdir(String s) {
		File f = new File(s);
		if (!f.isDirectory()) {
			f.mkdirs();
			System.out.println("����Ŀ¼�ɹ�");
		} else {
			System.out.println("Ŀ¼�Ѵ���");
		}
	}

	// �����ļ�����
	public void createf(String s) {
		File f = new File(s);
		if (!f.isFile()) {
			try {
				f.createNewFile();
				System.out.println("�����ļ��ɹ�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѵ���");
		}
	}
}
