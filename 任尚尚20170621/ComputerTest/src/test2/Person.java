package test2;
/**
 * @author 任尚尚
 * 创建Person类
 */
public class Person {
	//属性
	private String name;
	
	//getter&&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//构造方法
	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	
	//说话方法
	public void speak(){
		System.out.println("咿咿呀呀！");
	}
	
}
