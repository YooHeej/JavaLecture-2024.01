package zzz;

public class ZZ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 02. 디지털 시계, 00:00 ~ 23:59 하루동안 3이 표시되는 시간은 몇 초인가?

		int displayTime = 0;
		for (int hour = 0; hour <= 23; hour++) {
			for (int minute = 0; minute <= 59; minute++) {
				String clock = hour + ":" + minute;
				if(clock.indexOf('3') >= 0)
					displayTime += 60;
			}
		}
		System.out.println("하루 동안 3이 표시되는 시간은" + displayTime + "초 입니다.");
	}
}
