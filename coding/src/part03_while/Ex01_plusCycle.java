package part03_while;

import java.util.Scanner;

// 더하기 사이클 (백준 1110번)
// 1) 0보다 크거나 같고, 99보다 작거나 같은 정수 입력
// 2) 입력한 정수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
// 3) 입력한 정수의 가장 오른쪽 자리 수와 합의 가장 오른쪽 자리 수를 이어 붙여 새로운 수를 만든다.
// 4) 새로운 수가 입력한 정수와 같아질 때 까지 반복
// 5) 사이클의 길이 출력
// 입력 => 26    55    1
// 출력 => 4     3     60
public class Ex01_plusCycle {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		int newNum = 0;
		int cnt = 0;

		while (true) {
			System.out.print("0보다 크거나 같고, 99보다 작거나 같은 정수 입력 -> ");
			num = sc.nextInt();

			if (num >= 0 && num <= 99) {
				newNum = num;
				break;
			}

			System.out.println("다시 입력하세요!");

		} // end of while

		do {
			// sum : 각 자리수를 더한 값
			sum = newNum / 10 + newNum % 10;
			// newNum : 입력한 정수의 가장 오른쪽 자리 수와 합(sum)의 가장 오른쪽 자리 수를 이어 만든 값
			newNum = (newNum % 10) * 10 + sum % 10;
			// cnt : 사이클 길이
			cnt++;
		} while (num != newNum); // 입력한 정수와 새로 만든 값이 같을 때까지 반복

		System.out.println(cnt);
	}
}
