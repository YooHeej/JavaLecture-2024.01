package t0131.q01;

public class Q01_0102 {

	public static void main(String[] args) {

//		1) 1에서 100까지 3의 배수의 합을 구하세요.

		int sum = 0;
		for (int i = 0; i < 100; i+= 3)
			sum += i;
		System.out.println("1 ~ 100까지 3의 배수의 합 = " + sum);
		
		
//		2) 1에서 20까지 홀수 제곱의 합을 구하세요.
		
		int odsqsum = 0;			// odsqsum =  홀수 제곱의 합
		for (int i = 1; i < 20; i+= 2)
			odsqsum += i * i;
		System.out.println("1 ~ 20까지 홀수 제곱의 합 = " + odsqsum);
	}
}
