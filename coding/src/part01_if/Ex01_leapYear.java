package part01_if;

import java.util.Scanner;

// 윤년 (2753번)
// 윤년이면 1, 아니면 0을 출력하는 프로그램
// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때
// 또는 400의 배수일 때 이다.
// 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
// 입력 => 1900	입력 => 2000
// 출력 => 0		출력 => 1
public class Ex01_leapYear {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int year = 0;
		int result = 0;

		while (true) {
			System.out.print("연도를 입력하세요 -> ");
			year = sc.nextInt();

			if (year < 1 || year > 4000) {
				System.out.println("연도를 다시 입력하세요!");
			} else {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					result = 1;
				}
				break;
			} // end of if
			
		} // end of while
		
		System.out.println(result);
	}
}
