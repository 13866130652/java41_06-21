package homeWork1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1)、创建Student类，设置属性name,age,gender,className
 * 创建Students.xml文档用来保存学员姓名、年龄、性别、所在班级。使用DOM4J解析students.xml文档，
 * 并把解析出来的学员信息保存到ArrayList<Student>集合中，在控制台打印出所有学员信息。（10分）
 */
public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student("特朗普", 18, '男', "合肥科海Java43");
		Student s2 = new Student("苍井空", 18, '女', "合肥科海Java43");
		Student s3 = new Student("孙悟空", 18, '男', "合肥科海Java43");
		Student s4 = new Student("费玉清", 18, '男', "合肥科海Java43");
		s1.getName();
		CreateDemo cd = new CreateDemo();
		cd.createdir("D:\\homework20170621");
		cd.createf("D:\\homework20170621\\Students.xml");
		Map<String, Student> map = new LinkedHashMap<String, Student>();
		map.put("大嘴总统", s1);
		map.put("AV女神", s2);
		map.put("齐天大圣", s3);
		map.put("双面污王", s4);
		System.out.println(map);
	}
}
