package cn.test4;

/**
 * ���������ʽ�Ƿ���ȷ
 */
public class EmailFormat {
	public static boolean emailFormat(String Email) {
		if (Email.indexOf("@") != -1 && Email.indexOf(".") != -1) {// ���������а�����@����.��
			// �ж������ַ��ǲ��Ƕ�ֻ������һ��
			if (Email.indexOf("@") == Email.lastIndexOf("@") && Email.indexOf("@") == Email.lastIndexOf("@")) {
				if (Email.indexOf("@") != 0 && Email.indexOf(".") != 0) {// ���������С�@����.��������λ
					// ���������С�@����.������ĩλ
					if (!(Email.endsWith("@") || Email.endsWith("."))) {
						// ����@���ű�����.����֮ǰ������@��.�����м����ٰ���һ���ַ���
						if (Email.indexOf(".") - Email.indexOf("@") > 1) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * main����
	 */
	public static void main(String[] args) {
		String Email = "1011157554@qq.com";
		System.out.println(Email + ":��ʽ�Ƿ���ȷ��" + emailFormat(Email));
	}
}
