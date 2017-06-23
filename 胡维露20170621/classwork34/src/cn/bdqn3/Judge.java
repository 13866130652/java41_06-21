package cn.bdqn3;

public class Judge {

	public void judgeEmail(String name) {
		if (name.contains(".") && name.contains("@")) {
			if (name.indexOf('.') != 0 && name.indexOf('@') != 0
					&& name.lastIndexOf('.') != (name.length() - 1)
					&& name.lastIndexOf('@') != (name.length() - 1)) {
				if (name.indexOf('.') - name.indexOf('@') >= 1) {
					System.out.println("邮箱合法！");
				} else {
					System.out.println("邮箱不合法！");
				}
			} else {
				System.out.println("邮箱不合法！");
			}
		} else {
			System.out.println("邮箱不合法！");
		}

	}
}
