package t0131.q01;

import java.util.ArrayList;
import java.util.List;


public class Q02_03 {
	
//2) james, maria 두 객체를 ArrayList로 만들어 반환하는 메소드 getMemberList() 를 만드세요.
	
	static List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		list.add(new Member(1, "james", 2000, "010-1665-5661"));
		list.add(new Member(2, "maria", 1900, "011-1665-5661"));
		return list;

		
	//3) (2)에서 만든 객체의 전화번호를 변경한 후 두 객체를 출력하세요.
		
		
	}
	
	public static void main(String[] args) {
		List<Member> list = getMemberList();
		for (Member m: list)
			System.out.println(m);
	}
	
	

}
