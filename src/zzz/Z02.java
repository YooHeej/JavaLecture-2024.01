package zzz;

public class Z02 {

	public static void main(String[] args) {
		
		int score = 72;
		
		switch(score) {
		case 100:
		case 90:
			System.out.println("A학점"); break;
		case 80:
			System.out.println("B학점"); break;
		case 70:
			System.out.println("C학점"); break;
		default:
			System.out.println("F학점");
		}

	}

}
