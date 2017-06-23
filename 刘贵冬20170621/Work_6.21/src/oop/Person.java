package oop;

public class Person {
	private String name;// ÐÕÃû

	public Person() {

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("ßÞßÞÑ½Ñ½£¡");
	}

}
