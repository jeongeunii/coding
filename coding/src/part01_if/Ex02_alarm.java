package part01_if;

import java.util.Scanner;

// 알람 시계 (백준 2884번)
// 45분 일찍 알람 맞추기
// 두 정수  H와 M이 주어진다. (0<=H<=23, 0<=M<=59)
// 하루의 시작은 0:0이고, 끝은 23:59이다.
// 입력 => 10 10
// 출력 => 9 25
public class Ex02_alarm {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int hour = 0;
		int min = 0;

		while (true) {
			System.out.print("시간과 분을 입력하세요 -> ");
			hour = sc.nextInt();
			min = sc.nextInt();

			if (hour >= 0 && hour <= 23 && min >= 0 && min <= 59) {
				if (min >= 45) {
					min -= 45;
				} else {
					if (hour == 0) {
						hour = 23;
					} else {
						hour--;
					}
					min += 15; // min = min + 60 - 45;
				}
				break;
			} else {
				System.out.println("다시 입력하세요!");
			} // end of if
			
		} // end of while
		
		System.out.println(hour + "시 " + min + "분");
	}

}
