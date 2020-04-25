package part06_string;

import java.util.Scanner;

// 아스키코드 (백준 11654번)
// 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 주어졌을 때, 주어진 글자의 아스키 코드 값 출력
public class Ex01_ASCIIcode {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("문자 입력 -> ");
		String ch = sc.next();
		System.out.println((int) ch.charAt(0));

	}
}
