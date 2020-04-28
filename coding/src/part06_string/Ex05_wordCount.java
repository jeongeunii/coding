package part06_string;

import java.util.Scanner;

// 단어의 개수 (백준 1152번)
// 1) 영어 대소문자와 띄어쓰기만으로 이루어진 문자열 입력
// 2) 단어의 개수 출력 (단어는 띄어쓰기 한 개로 구분)
public class Ex05_wordCount {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str = ""; // 영어 대소문자와 띄어쓰기만으로 이루어진 문자열
		int cnt = 1; // 단어의 개수

		System.out.print("문자열 입력 -> ");
		// nextLine() : 공백을 포함하여 문자열 저장
		// next() : 공백으로 구분하여 문자열 저장
		str = sc.nextLine();
		// 맨 앞, 맨 뒤 공백 제거
		str = str.trim();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') { // 자리 값이 공백일 경우
				if (str.charAt(i - 1) == ' ') { // 그 전 자리 값도 공백일 경우
					continue; // 다음 자리로 제어 넘김
				}
				cnt++; // 단어의 개수 증가
			}
		} // end of for

		System.out.println(cnt);
	}
}
