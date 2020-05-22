package part08_recursion;

import java.util.Scanner;

// 팩토리얼 (백준 10872번)
// 1) 0보다 크거나 같은 정수 N 입력
// 2) N! 출력
public class Ex01_factorial {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("정수 입력 -> ");
		int n = sc.nextInt(); // 정수

		System.out.println(fact(n));
	} // main method

	public static int fact(int n) {
		int result = 0;

		if (n == 1) {
			result = 1;
		} else {
			// 재귀호출
			result = n * fact(n - 1);
		}
		
		return result;
	} // fact method
}
