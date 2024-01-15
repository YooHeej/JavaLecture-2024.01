package ch01_intro;

// class 이름(=Ex01_HelloWorld)은 대문자로 시작
public class Ex01_HelloWorld {

	/**
	 * document 주석 - API document 만들 때 사용
	 * @param args
	 */
	// method 이름(=main)은 소문자로 시작
	public static void main(String[] args) {
		// sysout, syso 를 타이핑 한 후 Ctrl + Space 치면 -> System.out.println() 생성.
		System.out.println("Hello World!");			// 문장 끝에는 반드시 세미콜론(=;)을 붙여야 한다
		/*
		 * 여러줄 주석
		 */
		System.out.println("안녕하세요???" + "여러분!");	// 하나의 문자열만 올 수 있음 (두 개 이상일 겨우에는 '+' 연산자를 사용해야 한다.
//		System.out.println();								// Ctrl + '/' : 문장을 커멘트 처리 (ㅣ		
	}

}
