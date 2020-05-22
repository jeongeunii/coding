package part10_dynamic;

import java.util.Scanner;

// 피보나치 수 (백준 2748번)
// 피보나치 수는 0과 1로 시작한다. 0번 째 피보나치 수는 0이고, 1번 째 피보나치 수는 1이다.
// 2번 째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 1) 90보다 작거나 같은 자연수 n 입력
// 2) n번 째 피보나치 수 출력
public class Ex01_fibonacci {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("90보다 작거나 같은 자연수 입력 -> ");
		int n = sc.nextInt(); // 자연수
		int a = 0, b = 1, c = 0; // 0번 째, 1번 째, 2번 째 피보나치 수 초기화 값
		int result = 0; // 피보나치 수

		if (n == 1) { // 자연수가 1인 경우
			result = n;
		} else { // 자연수가 2 이상인 경우
			for (int i = 1; i < n; i++) {
				// 바로 앞 두 피보나치 수의 합을 구한 후 다음 두 피보나치 수 업데이트
				c = a + b;
				a = b;
				b = c;
			}
			result = c;
		} // end of if

		System.out.println(result);
	}
}
