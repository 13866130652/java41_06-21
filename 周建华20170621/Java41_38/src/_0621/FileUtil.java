package _0621;

import java.io.File;

public class FileUtil {
	public static void getPaths(String path){
		 
		File f=new File(path);	
		//ʹ��isDirectory()�����ж��Ƿ���Ŀ¼���������Ŀ¼������ļ���
		//�����ʹ��listFiles()�����������ļ�����Ŀ¼
		//���������Ŀ¼���������������ݹ�ѭ��
		if(f.isDirectory()){
			File[] file=f.listFiles();
			for (File files : file) {
				getPaths(files.getPath());
			}
		}else{//����Ŀ¼����ļ���
			String name=f.getName();
			System.out.println(name);

		}
	}
	//�����ļ��Ƿ���ָ����β
	public static boolean testJava(String file){
		char ch[]=file.toString().toCharArray();			
		StringBuffer sb1=new StringBuffer();
		for (int i = ch.length-5; i < ch.length; i++) {
			sb1.append(ch[i]);		
		}
			return sb1.toString().equals(".java");		
	}
	//���Ƶķ���:��matter�ļ����Ƶ�fileĿ¼��
	
	public static void main(String[] args) {
		getPaths("D:");	
	}

}
