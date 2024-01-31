package t0131.q01;

import java.util.Scanner;

public class Q01_0304 {
	
//		3) 어떤 수가 소수(prime number: 1과 자기자신만을 약수로 갖는 수, 예: 2, 3, 5 …)인가를
//		판단하는 메소드 Boolean isPrime(int num);를 만드세요.

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("숫자 입력> : ");
      
		int num = sca.nextInt();

		
		boolean isPrime = true;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "소수" : "소수 X");

		
//		4) (3)에서 만든 메소드를 이용하여 2에서부터 100까지 소수의 합을 구하세요.
		
		
	}
}