package ch17_collection.park1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ListVsArray {

	public static void main(String[] args) {
		String[] array = "abcdefg".split("");
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();		// 구현객체(ArrayList)에 있는 <String>에서 String 생략 가능
		list.add("a"); list.add("b"); list.add("c"); list.add("d");
		list.add("e"); list.add("f"); list.add("g");
//		for (String element: list)
//			System.out.println(element + " ");
//		System.out.println();
//		list.forEach(x -> System.out.println(x + " "));
//		System.out.println();
		System.out.println(list);
		
		
		// 삭제
		array[2] = null; array[5] = null;
		System.out.println(Arrays.toString(array));
		
		list.remove("c"); list.remove("f");
		list.forEach(x -> System.out.println(x + " "));
		System.out.println();
		
		
		// 삭제 후 크기 비교
		System.out.println(array.length + ", " + list.size());
		
		
		// 추가(삽입)
		list.add("h"); list.add("j"); list.add("i");
		System.out.println(list);
		
		// 추가 후 크기
		System.out.println(list.size());

	}

}
