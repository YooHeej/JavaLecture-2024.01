package ch17_collection.qna.q8_set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		System.out.println(set.size());
		for (Student st: set)
			System.out.println(st);

	}

}
