package cn.bdqn;
/**
 * 
 * @author 汪超炜
 *创建Person类，属性有private String name,
 *并编写getter和setter方法，
 *编写父	类无参构造函数和带参构造函数，
 *方法有public void speak()，
 *输出”咿咿呀呀！”
 *
 */
//Person类
public class Person {
	//姓名
	private String name;
	//无参构造
	public Person(){
	}
	//有参构造
	public Person(String name) {
		super();
		this.name = name;
	}
	//get和set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//方法输出咿咿呀呀！
	public void speak(){
		System.out.println("咿咿呀呀！");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
