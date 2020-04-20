package example;

import java.util.Scanner;

// 문자열 대칭
// 1) 문자열을 입력받고
// 2) 문자열이 대칭이면 true, 대칭이 아니면 false 출력
public class ex03_symmetry {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.print("문자열을 입력하세요 -> ");
			String str = sc.nextLine();
			int cnt = str.length();
			int end = cnt - 1;
			boolean result = true;

			if (str.equals("exit")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

			// 문자열길이/2 만큼 반복하여 i와 end번 째 자리 문자 비교
			for (int i = 0; i < cnt / 2; i++, end--) {
				if (str.charAt(i) != str.charAt(end)) {
					result = false;
					break;
				}
			}

			System.out.println(result);
			
		} // end of while
	}
}
