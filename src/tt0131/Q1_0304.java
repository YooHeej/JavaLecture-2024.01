package tt0131;

public class Q1_0304 {

	//	3) 어떤 수가 소수(prime number: 1과 자기자신만을 약수로 갖는 수, 예: 2, 3, 5 …)인가를
//	판단하는 메소드 Boolean isPrime(int num);를 만드세요.
	
	static Boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

//	4) (3)에서 만든 메소드를 이용하여 2에서부터 100까지 소수의 합을 구하세요.
	public static void main(String[] args) {
		int sumPrime= 0;
		
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				sumPrime += i;
			}
		}
		System.out.println("2 ~ 100 까지 소수의 합 = " + sumPrime);
	}
	
}
