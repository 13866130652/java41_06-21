package _0621;

import java.io.File;

public class FileUtil {
	public static void getPaths(String path){
		 
		File f=new File(path);	
		//使用isDirectory()方法判断是否是目录，如果不是目录则输出文件名
		//如果，使用listFiles()创建数组存放文件名和目录
		//如果还有子目录，继续掉用自身，递归循环
		if(f.isDirectory()){
			File[] file=f.listFiles();
			for (File files : file) {
				getPaths(files.getPath());
			}
		}else{//不是目录输出文件名
			String name=f.getName();
			System.out.println(name);

		}
	}
	//测试文件是否以指定结尾
	public static boolean testJava(String file){
		char ch[]=file.toString().toCharArray();			
		StringBuffer sb1=new StringBuffer();
		for (int i = ch.length-5; i < ch.length; i++) {
			sb1.append(ch[i]);		
		}
			return sb1.toString().equals(".java");		
	}
	//复制的方法:把matter文件复制到file目录下
	
	public static void main(String[] args) {
		getPaths("D:");	
	}

}
