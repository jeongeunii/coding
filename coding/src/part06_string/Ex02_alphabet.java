package part06_string;

import java.util.Arrays;
import java.util.Scanner;

// 알파벳 찾기 (백준 10809번)
// 1) 알파벳 소문자로만 이루어진 단어 S 입력
// 2) 각각의 알파벳에 대해서 단어가 포함되어 있는 경우 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력
public class Ex02_alphabet {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str = ""; // 소문자로 이루어진 단어
		int[] arr = new int[26]; // 알파벳 등장 위치 배열

		for (int i = 0; i < arr.length; i++) {
			// 기본값 -1 설정
			arr[i] = -1;
		}

		System.out.print("단어 S 입력 -> ");
		str = sc.next();

		// arr 배열에 각 알파벳의 처음 등장 위치 저장
		for (int i = 0; i < str.length(); i++) {
			// a의 아스키코드 값 : 97  -> arr의 0번지
			// z의 아스키코드 값 : 122 -> arr의 25번지
			arr[(int) str.charAt(i) - 97] = str.indexOf(str.charAt(i));
		}

		System.out.println(Arrays.toString(arr));
	}
}
