package part06_string;

import java.util.Scanner;

// 그룹 단어 (백준 1316번)
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우를 말한다.
// 예를 들어, ccazzzbb와 kin은 각 문자가 연속해서 나타나기 때문에 그룹 단어이다.
// aabbbccb는 b가 연속되지 않고 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 1) 단어의 개수 N 입력 (N은 100보다 작거나 같은 자연수)
// 2) N개의 단어 입력 (알파벳 소문자로만)
// 3) 그룹 단어의 개수 출력
public class Ex09_groupWord {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("단어의 개수 입력 -> ");
		int n = sc.nextInt(); // 단어의 개수
		System.out.print(n + "개의 단어 입력 -> ");
		String[] arr = new String[n]; // 단어 배열
		int index = 0; // 알파벳 첫 등장 인덱스
		int lastIndex = 0; // 알파벳 마지막 등장 인덱스
		int cnt = 0; // 그룹 단어의 개수

		a: for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			for (int j = 0; j < arr[i].length(); j++) {
				index = arr[i].indexOf(arr[i].charAt(j));
				lastIndex = arr[i].lastIndexOf(arr[i].charAt(j));
				// 알파벳 첫 등장 인덱스부터 마지막 등장 인덱스까지 알파벳 검사 실행
				for (int k = index; k <= lastIndex; k++) {
					// 다른 알파벳이 있는 경우
					if (arr[i].charAt(index) != arr[i].charAt(k)) {
						continue a; // a:for 다음 단어로 제어 넘김
					}
				}
				// for문은 마지막에 ++이 되기 때문에
				// j에 lastIndex를 저장하면 다음 제어 시 j는 (lastIndex + 1)
				j = lastIndex;
			} // end of for
			cnt++; // 그룹 단어의 개수 증가
		} // end of a:for
		
		System.out.println(cnt);
	}
}
