package test4;

import java.util.Scanner;
/**
 * @author ������
 * ��֤�����Ƿ�Ϸ�
 */
public class EmailNameTest {
	//�ж��ַ����Ƿ����"@"��"."
	public static boolean isExists(String name){
		if(name.contains("@")&&name.contains(".")){
			return true;
		}
		return false;
	}
	
	//�ж��ַ�����"@"��"."��λ��
	public static boolean testPlace(String name){
		if(name.indexOf("@")!=0&&name.indexOf(".")!=0&&name.indexOf("@")!=(name.length()-1)&&name.indexOf(".")!=(name.length()-1)){
			return true;
		}
		return false;
	}
	
	//�ж��ַ�����"@"��"."��˳��
	public static boolean testOrder(String name){
		if(name.indexOf("@")<name.indexOf(".")-1){
			return true;
		}
		return false;
	}
	
	//�ж��ַ�������Ƿ�Ϊ".com"
	public static boolean testWords(String name){
		if(name.substring(name.indexOf(".")).equals(".com")){
			return true;
		}
		return false;
	}
	
	//main����
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������������:");
		String name = input.next();
		if(isExists(name)&&testPlace(name)&&testOrder(name)&&testWords(name)){
			System.out.println("������Ϸ�!");
		} else {
			System.out.println("�����䲻�Ϸ�!");
		}
	}
}