package part11_greedy;

import java.util.Scanner;

// 동전 (백준 11047번)
// 1) 금액 K 입력
// 2) K원을 만드는데 필요한 동전의 최소 개수 출력
public class Ex01_coin {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("금액 입력 -> ");
		int k = sc.nextInt(); // 금액
		int[] arr = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 }; // 동전 배열
		int cnt = 0; // 동전의 최소 개수

		while (k > 0) { // 금액이 0보다 클 동안 실행
			// 금액이 큰 동전부터 실행
			for (int i = arr.length - 1; i >= 0; i--) {
				while (k >= arr[i]) { // 금액이 동전 금액보다 클 동안 실행
					k -= arr[i];
					cnt++;
				}
			}
		} // end of while

		System.out.println(cnt);
	}
}
