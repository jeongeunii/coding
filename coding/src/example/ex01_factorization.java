package example;

import java.util.Scanner;

// 소인수 분해
// 1) 숫자를 입력 받는다.
// 2) 결과 값이 입력 받은 숫자 = x * y 형식으로  ex) 24 = 2 * 2 * 2 * 3
// 3) 0이 입력 되면 프로그램이 out 되도록
// 4) 결과 값이 나온다면 다시 위 과정 반복
public class ex01_factorization {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.print("숫자를 입력하세요 -> ");
			int cnt = sc.nextInt();
			int i = 2;
			String result = cnt + " = ";

			if (cnt == 0) {
				System.out.println("시스템 종료");
				System.exit(0);
			} // end of if

			while (cnt != 1) {
				if (cnt % i == 0) {
					cnt /= i;
					result += i;
				} else {
					i++;
					// cnt % i != 0 이라면 아래의 코드를 실행하지않고 다음 제어로 넘김
					continue;
				}
				
				// cnt = 1 이 되어 소인수분해의 마지막 값 뒤에는 * 출력 안함
				if(cnt != 1) {
					result += " * ";
				}
			} // end of while(cnt != 1)

			System.out.println("소인수분해 결과 : " + result + "\n");
		} // end of while(true)
	}
}
