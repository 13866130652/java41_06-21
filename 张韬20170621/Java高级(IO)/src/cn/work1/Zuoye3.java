package cn.work1;

import java.util.Scanner;

public class Zuoye3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����������ţ�");
		String mail=input.next();
		boolean flag=false;//����Ƿ����@��.�ַ�
		boolean flag1=false;//���@��.�Ƿ��ڵ�һ��λ�û������һ��
		boolean flag2=false;//���@�Ƿ���.֮ǰ����@���ź�.����֮���Ƿ����������һ���ַ�
		if(mail.contains("@")&&mail.contains(".")){
			flag=true;
		}
		if(mail.indexOf("@")!=0&&mail.indexOf(".")!=0&&mail.lastIndexOf("@")!=mail.length()-1&&mail.lastIndexOf(".")!=mail.length()-1){
			flag1=true;
		}
		//��ȡ���һ��@��.���ų����м���������Ԫ��
		if(mail.lastIndexOf("@")<mail.lastIndexOf(".")&&(mail.substring(mail.lastIndexOf("@"), mail.lastIndexOf("."))).length()!=1){
			flag2=true;
		}
		if(flag&&flag1&&flag2){
			System.out.println("�����¼�ɹ���");
		}else{
			System.out.println("�����ʽ���󣬵�¼ʧ�ܣ�");
		}
	}

}
