package ch14_exception;

public class Ex02_Unchecked {

	public static <Animal> void main(String[] args) {
		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int[] intArray = new int[3];
		try {
		System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		
		}
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		try { 
		Cat cat = (Cat) a1;
		cat = (Cat) a2;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램의 마지막 입니다.");
	}

}

class Animal { }
class Dog extends Animal { } 
class Cat extends Animal { }