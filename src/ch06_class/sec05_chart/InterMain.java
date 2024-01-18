package ch06_class.sec05_chart;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inter[] rankers = {
			new Inter(1, "처음부터 시작하는 주식투자", "홍인기", ".", "길벗", 18900),
			new Inter(2, "마흔에 읽는 쇼펜하우어", "강용수", ".", "유노북스", 15300),
			new Inter(3, "세이노의 가르침", "세이노", ".", "데이원", 6480),
			new Inter(4, "이처럼 사소한 것들", "Claire Keegan", "홍한별", "다산책방", 12420),
			new Inter(5, "죽음이 물었다, 어떻게 살 거냐고", "한스 할터", "한윤진", "포레스트북스", 16020)
		};
		
		for (Inter inter: rankers)
			System.out.println(inter);
	}

}
