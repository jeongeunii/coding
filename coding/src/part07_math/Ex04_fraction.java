package part07_math;

import java.util.Scanner;

// 분수 찾기 (백준 1193번)
// 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> 1/3 -> 1/4 -> 2/3 ->.. 과 같은
// 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번,... 분수라고 한다.
// 1) 숫자 X 입력
// 2) X번 째 분수 출력
public class Ex04_fraction {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("숫자 입력 -> ");
		int num = sc.nextInt(); // 숫자
		int inc = 2; // 증감률
		int val = 1; // 합이 같은 분수의 위치 최댓값
		int sum = 2; // 분자와 분모의 합
		int result = 0; // 분자와 분모 중 큰 값

		while (true) {
			// 분수의 위치를 파악한 경우 while문 종료
			if (num <= val) {
				break;
			}
			val += inc++;
			sum++;
		} // end of while

		result = sum - 1; // 가장 큰 값은 합-1
		// 숫자에 알맞은 분수 위치 탐색
		while (num != val) {
			result--;
			num++;
		}

		if (sum % 2 == 0) {
			System.out.println((sum - result) + "/" + result);
		} else {
			System.out.println(result + "/" + (sum - result));
		}
	}
}
