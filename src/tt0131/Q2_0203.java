package tt0131;

import java.util.ArrayList;
import java.util.List;

public class Q2_0203 {

//2) james, maria 두 객체를 ArrayList로 만들어 반환하는 메소드 getMemberList() 를 만드세요.

	static List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		list.add(new Member(1, "james", 2000, "010-1665-5661"));
		list.add(new Member(2, "maria", 1980, "011-5661-1665"));
		return list;

	}
//3) (2)에서 만든 객체의 전화번호를 변경한 후 두 객체를 출력하세요.
	
	public static void main(String[] args) {
		List<Member> memberList = getMemberList();
		
		memberList.get(0).setTel("010-5661-2000");
		memberList.get(1).setTel("010-1665-1980");
		
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}