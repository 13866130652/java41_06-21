package homeWork1;

import java.io.File;

public class CreateDemo {

	// 创建目录方法
	public void createdir(String s) {
		File f = new File(s);
		if (!f.isDirectory()) {
			f.mkdirs();
			System.out.println("创建目录成功");
		} else {
			System.out.println("目录已存在");
		}
	}

	// 创建文件方法
	public void createf(String s) {
		File f = new File(s);
		if (!f.isFile()) {
			try {
				f.createNewFile();
				System.out.println("创建文件成功");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("文件已存在");
		}
	}
}
