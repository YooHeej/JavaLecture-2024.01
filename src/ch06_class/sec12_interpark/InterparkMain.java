package ch06_class.sec12_interpark;

public class InterparkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterparkBook[] interparkBookArray = {
			new InterparkBook(1, "처음부터 시작하는 주식투자 단타전략", "홍인기", null, "길벗", 18900),
			new InterparkBook(2, "마흐네 읽는 쇼펜하우어", "강용수", null, "유노북스",15300),
			new InterparkBook(3, "세이노의 가르침", "세이노", null, "데이원", 6480),
		};
		for (InterparkBook ib: interparkBookArray)
			System.out.println(ib);
	}
}
