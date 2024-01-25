package ch17_collection.park2_set;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_TreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10); set.add(6); set.add(15); set.add(12); set.add(4); set.add(20);
		System.out.println(set);
		
		Set<String> strSet = new TreeSet<String>();
		strSet.add("g"); strSet.add("b"); strSet.add("c"); strSet.add("h"); strSet.add("d");
		System.out.println(strSet);

	}

}
