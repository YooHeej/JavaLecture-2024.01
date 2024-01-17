package zzz;

public class ZZ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3. 두 개의 세자리수를 곱해서 나온 결과가 palindrome 일때
//		   가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
		
		int maxPal = 0, max1 = 0, max2 = 0;
		for (int i = 100; i <= 999; i++) {
			for(int j = i; j <= 999; j++) {
				int mul = i * j;
				 if(mul > maxPal ) {
					 maxPal = mul; max1 = i; max2 = j;
				 
				}
			}
			
		}
	}
}