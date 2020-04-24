package part04_array;

import java.util.Scanner;

// OX퀴즈 (백준 8958번)
// O는 문제를 맞은 것이고, X는 문제를 틀린 것
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
// OOXXOXXOOO의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
// 1) 테스트 케이스의 개수 입력
// 2) 케이스 개수만큼 문자열 입력(문자열은 O와 X만으로 이루어져 있음)
// 3) 점수 출력
public class Ex04_ox {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0; // 테스트 케이스 개수
		int[] score = null; // 점수 배열
		String str = ""; // 문자열
		int result = 0; // 최종 점수

		System.out.print("테스트 케이스 개수 입력 -> ");
		n = sc.nextInt();
		score = new int[n];

		System.out.print(n + "개의 문자열 입력 -> ");
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'O') { // i번째 문자가 'O'일 경우
				if (i == 0) { // 첫 번째 문자일 경우 비교할 이전의 값이 없기 때문에 1점 부여
					score[i] = 1;
				} else {
					if (str.charAt(i - 1) == 'O') { // 이전의 값도 'O'일 경우
						score[i] = score[i - 1] + 1;
					} else { // 이전의 값이 'O'이 아닐 경우
						score[i] = 1;
					}
				}
				result += score[i];
			} // end of if
		} // end of for

		System.out.println(result);
	}
}
