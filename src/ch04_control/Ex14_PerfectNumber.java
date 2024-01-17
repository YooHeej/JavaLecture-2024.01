package ch04_control;

import java.util.Scanner;

public class Ex14_PerfectNumber {

	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
		//	int divSum = 0;
		//	for (int k = 1; k < i; k++) {
		//		if(i % k ==0)
		//			divSum += k;
		//	}
			int divSum = sumOfDivisors(i);
			if (i == divSum)
				System.out.println(i);
		}
	}

	static int sumOfDivisors(int num) {
		int divSum = 0;
		for (int i = 1; i < num; i++)
			if (num % i ==0)
				divSum += i;
		return divSum;
		}
	}
