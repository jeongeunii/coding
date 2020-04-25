package part06_string;

import java.util.Scanner;

// 가장 많이 사용된 알파벳 (백준 1157번)
// 1) 알파벳 대소문자로 이루어진 단어 입력
// 2) 이 단어에서 가장 많이 사용된 알파벳 출력
// 3) 가장 많이 사용된 알파벳이 여러 개 존재하는 경우 ? 출력
public class Ex04_mostUsed {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("단어 입력 -> ");
		String str = sc.next(); // 대소문자로 이루어진 단어
		// 모든 문자를 소문자로 변경
		str = str.toLowerCase();
		int[] arr = new int[26]; // 알파벳 등장 횟수 배열
		int max = 0; // 등장 횟수 최댓값
		int index = 0; // 최댓값의 인덱스
		boolean flag = false; // 가장 많이 사용된 알파벳이 여러 개 존재하는지 여부

		// 단어의 각 알파벳의 등장 횟수 증가
		for (int i = 0; i < str.length(); i++) {
			arr[(int) str.charAt(i) - 97]++;
		}

		// 등장 횟수 최댓값과 인덱스 저장
		for (int i = 0; i < arr.length; i++) {
			// 배열의 값이 0이 아닐 경우만 실행
			if (arr[i] != 0) {
				if (arr[i] > max) { // max보다 큰 경우
					max = arr[i];
					index = i;
					flag = false;
				} else if (arr[i] == max) { // max와 같은 경우
					flag = true; // 가장 많이 사용된 알파벳이 여러 개 존재함
				}
			}
		}

		if (flag) {
			System.out.println("?");
		} else {
			System.out.println((char) (index + 97));
		}
	}
}
