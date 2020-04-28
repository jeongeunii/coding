package part06_string;

import java.util.Scanner;

// 거꾸로 비교 (백준 2908번)
// 1) 같지 않은 세 자리 정수 2개 입력 (0이 포함되어 있지 않음)
// 2) 각 정수를 거꾸로 읽고 더 큰 값 출력
public class Ex06_backwards {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("세 자리 정수 2개 입력 -> ");
		String str1 = sc.next(); // 세 자리 정수
		String str2 = sc.next(); // 세 자리 정수
		String result = ""; // 더 큰 값

		// 각 정수를 거꾸로 다시 저장
		str1 = str1.substring(2) + str1.substring(1, 2) + str1.substring(0, 1) + "";
		str2 = str2.substring(2) + str2.substring(1, 2) + str2.substring(0, 1) + "";
		
		if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
			result = str1;
		} else {
			result = str2;
		}
		
		System.out.println(result);
	}
}
