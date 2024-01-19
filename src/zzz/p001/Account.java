package zzz.p001;

public class Account {
	
	private int Balance;
	private static int Min_balance = 0;
	private static int Max_balance = 1000000;
	
	public int getBalance() {
		return Balance;
	}
	
	public void setBalance(int balance) {
		if (Min_balance <= balance && balance <= Max_balance) {
			this.Balance = balance;
	   }
	}
}