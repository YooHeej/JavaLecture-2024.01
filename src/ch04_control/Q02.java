package ch04_control;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =72;
		
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
		case 8:
			System.out.println("B학점");
		case 7:
			System.out.println("C학점");
		default:
			System.out.println("F학점");
		}

	}

}
