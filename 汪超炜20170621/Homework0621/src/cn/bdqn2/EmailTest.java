package cn.bdqn2;
/**
 * �����
 * ��������ַ�Ƿ�ϸ�
 * 
 * 
 */
import java.util.Scanner;

public class EmailTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������:");
		//���ַ��������������Ϣ
		String st=sc.next();
		//�ҵ�@��λ��
		int a=st.indexOf('@');
		//�ҵ�.��λ��
		int b=st.indexOf('.');
		//�鿴���һ��.��λ��
		int c=st.lastIndexOf('.');
		if(a<1||b<1||a>b||(c==st.length()-1)){
			System.out.println("���������ϸ�");
		}else if(b-a>1){
			System.out.println("�������ϸ�");
		}else{
			System.out.println("���������ϸ�");
		}
	}

}
