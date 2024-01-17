package zzz;

public class ZZ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr = "";
		for (int i = 1; i <= 1000; i++) {
			numStr += i;
		}
		for (int j = 0; j <= 9; j++) {
			int count = numStr.length() - numStr.replace(Integer.toString(j), "").length();
			System.out.println(j + " -> " + count);
		}
			
	}
}


