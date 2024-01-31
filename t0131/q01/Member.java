package t0131.q01;

import java.time.LocalDate;

//1) Member 클래스
//속성 (모든 속성이 비공개)
//    - member id(mid): 정수
//    - member name(name): 문자열
//    - 생년(birthYear): 정수
//    - 전화번호(tel): 문자열 
//
//생성자
//    - 기본 생성자
//    - 모든 속성값을 매개변수로 받아서 객체의 속성값을 설정하는 생성자
//
//메소드
//    - Getter/Setter 메소드
//    - Member를 출력하면 다음과 같이 나오게 해주는 메소드 (단, 나이는 금년 – 출생년)
//         ID: mid, 이름: name, 나이:ㅇㅇ, 전화번호: ㅇㅇㅇ-ㅇㅇㅇㅇ-ㅇㅇㅇㅇ

public class Member {

	private int id;
	private String name;
	private int birthYear;
	private String tel;
	
	public Member() { }

	public Member(int id, String name, int birthYear, String tel) {
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.tel = tel;
	}
	
	public int getAge() {
		LocalDate today = LocalDate.now();
		int age = today.getYear() - getBirthYear();
		
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [ID: " + id + ", 이름: " + name + ", 나이: " + getAge() + ", 전화번호: " + tel + "]";
	}
	
}
