package part05_function;

import java.util.Scanner;

// 한수 (백준 1065번)
// 어떤 양의 정수 n의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
// n이 주어졌을 때, 1보다 크거나 같고 n보다 작거나 같은 한수의 개수 출력
public class Ex02_sequence {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0; // 양의 정수
		int result = 0; // 한수의 개수

		System.out.print("양의 정수 입력 -> ");
		n = sc.nextInt();

		if (n < 100) { // 정수가 100보다 작을 경우 모든 수가 한수
			result = n;
		} else { // 정수가 100보다 크거나 같을 경우
			result = 99; // 초기 값은 99개
			String str = "";
			// 100부터 n까지 등차 검사 실행
			a: for (int i = 100; i <= n; i++) {
				str = Integer.toString(i);
				for (int j = 0; j < str.length() - 2; j++) {
					// 등차가 아닌 경우 a:for로 제어 넘김
					if ((str.charAt(j + 1) - str.charAt(j)) != (str.charAt(j + 2) - str.charAt(j + 1))) {
						continue a;
					}
				}
				result++; // 등차인 경우
			} // end of a:for
		} // end of if

		System.out.println(result);
	}
}