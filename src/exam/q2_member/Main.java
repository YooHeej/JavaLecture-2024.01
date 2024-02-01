package exam.q2_member;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		MemberUtil memberUtil = new MemberUtil();
		List<Member> list = memberUtil.getMemberList();
		System.out.println("변경 전");
		list.forEach(m -> System.out.println(m));
		
		Member james = list.get(0);
		Member maria = list.get(1);
		String tel = james.getTel();
		james.setTel(maria.getTel());
		maria.setTel(tel);
		System.out.println("변경 후");
		list.forEach(m -> System.out.println(m));

	}

}
