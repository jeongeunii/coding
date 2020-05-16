package part07_math;

import java.util.Scanner;

// 설탕 배달 (백준 2839번)
// 설탕 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
// 최대한 적은 봉지를 들고 가려고 한다.
// 1) 설탕 킬로그램 수 N 입력
// 2) 배달하는 봉지의 최소 개수 출력 (만약 정확하게 N킬로그램을 만들 수 없다면 -1 출력)
public class Ex02_sugar {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("설탕 킬로그램 수 입력 -> ");
		int n = sc.nextInt(); // 설탕 킬로그램 수
		int cnt = 0; // 봉지의 개수
		boolean flag = false; // 처음 값이 5보다 작은 경우를 분별하기 위한 플래그 변수

		if (n % 5 == 0) { // 최소 개수를 구해야하기 때문에 5로 나누어 떨어지는 경우 먼저 검사
			cnt = n / 5;
		} else {
			while (true) {
				if (n >= 5) { // 5보다 큰 경우
					n -= 5;
					cnt++;
					flag = true;
				} else if (n == 3) { // 남은 값 또는 처음 값이 3인 경우
					cnt++;
					break;
				} else if (flag && (n + 5) % 3 == 0) {
					// 처음 값이 5보다 크고 n+5 값이 3으로 나누어 떨어질 경우
					// 다시 이전으로 되돌린 후(n+5) 3으로 나눔
					n += 5;
					cnt = cnt - 1 + n / 3;
					break;
				} else { // 그 외 정확하게 킬로그램 수를 만들 수 없는 경우
					cnt = -1;
					break;
				}
			} // end of while
		} // end of if
		
		System.out.println(cnt);
	}
}
