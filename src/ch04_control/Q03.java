package ch04_control;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; ; i++) {
			if (i > 10)
				break;
			if (i % 2 == 1 )
				continue;
		System.out.println(i); 					// 0, 2, 4, 6, 8, 10
		}
		
		
	}

}
