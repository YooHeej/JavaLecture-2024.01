package ch10_oop.sec02_constructor;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	void eat() {
		System.out.println(name + " 이/가 맛있게 식사를 합니다.");
	}
	void sleep() {
		System.out.println(name + " 이/가 잠을 잡니다.");
	}
}
