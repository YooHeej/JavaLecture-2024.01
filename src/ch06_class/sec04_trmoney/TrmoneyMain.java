package ch06_class.sec04_trmoney;

import java.util.Scanner;

public class TrmoneyMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 > ");
		int age = Integer.parseInt(scan.nextLine());
		System.out.print("금액 > ");
		int cash = scan.nextInt();
		scan.close();
		
		Trmoney tm = new Trmoney(age, cash);
		System.out.println(tm);
		
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (!tm.ride())
				break;
			System.out.println(i + "회 탑승 후 ");
			System.out.println(tm);
		}
	}

}