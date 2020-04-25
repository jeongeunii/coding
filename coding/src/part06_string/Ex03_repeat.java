package part06_string;

import java.util.Scanner;

// 문자열 반복 (백준 2675번)
// 1) 테스트 케이스 개수 입력
// 2) 케이스 반복 횟수와 문자열 입력
// 3) 문자열의 각 문자를 횟수만큼 반복하여 출력
// 입력 => 3 abc
// 출력 => aaabbbccc
public class Ex03_repeat {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("테스트 케이스 개수 입력 -> ");
		int cnt = sc.nextInt(); // 테스트 케이스 개수
		int[] repeat = new int[cnt]; // 케이스 반복 횟수 배열
		String[] str = new String[cnt]; // 문자열 배열

		System.out.print("케이스 반복 횟수, 문자열 입력 -> ");
		for (int i = 0; i < cnt; i++) {
			repeat[i] = sc.nextInt();
			str[i] = sc.next();
		}

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				for (int k = 0; k < repeat[i]; k++) {
					System.out.print(str[i].charAt(j));
				}
			}
			System.out.println();
		} // end of for
	}
}
