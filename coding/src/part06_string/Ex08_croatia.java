package part06_string;

import java.util.Scanner;

// 크로아티아 알파벳 (백준 2941번)
// 크로아티아 알파벳 변경 전 : c=, c-, dz=, d-, lj, nj, s=, z= (나머지는 알파벳 그대로)
// 1) 단어 입력 (알파벳 소문자, -, = 로만 이루어져 있다)
// 2) 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
public class Ex08_croatia {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("단어 입력 -> ");
		String str = sc.next(); // 단어
		int leng = 0; // 크로아티아 알파벳의 길이
		int index = 0; // 크로아티아 알파벳 첫 등장 인덱스
		int cnt = 0; // 크로아티아 알파벳 개수
		// 크로아티아 알파벳 배열
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		// 크로아티아 알파벳 배열 하나씩 검사
		for (int i = 0; i < arr.length; i++) {
			// 해당 크로아티아 알파벳이 단어에 존재하는 동안 실행
			while (str.indexOf(arr[i]) != -1) {
				// 더 이상 존재하지 않으면 while문 종료
				if (str.indexOf(arr[i]) == -1) {
					break;
				}
				leng = arr[i].length();
				index = str.indexOf(arr[i]);
				// 공백 없이 붙이면 또 새로운 단어가 생성될 수 있기 때문에 사이에 공백 생성
				str = str.substring(0, index) + " " + str.substring(index + leng);
				// 크로아티아 알파벳 개수 증가
				cnt++;
			}
		}

		// 모든 공백 제거
		str = str.replace(" ", "");
		// 크로아티아 알파벳 개수에 더함
		cnt += str.length();

		System.out.println(cnt);
	}
}
