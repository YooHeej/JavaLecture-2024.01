package ch06_class.sec05_chart;

public class MelonMain {

	public static void main(String[] args) {
		
		Melon[] rankers = new Melon[5];
		rankers[0] = new Melon(1, "비의 랩소디", "임재현", "비의 랩소디", 33193);
		rankers[1] = new Melon(2, "To. X", "태연", "To. X", 82784);
		rankers[2] = new Melon(3, "Perfect Night", "LE SSERAFIM", "Perfect Night", 94989);
		rankers[3] = new Melon(4, "Drama", "aespa", "Drama", 68534);
		rankers[4] = new Melon(5, "에피소드", "이무진", "에피소드", 33230);
	
		for (int i = 0; i < rankers.length; i++)
			System.out.println(rankers[i]);
		
	}
}
