package part08_recursion;

import java.util.Scanner;

// 피보나치 수 (백준 10870번)
// 피보나치 수는 0과 1로 시작한다. 0번 째 피보나치 수는 0이고, 1번 째 피보나치 수는 1이다.
// 2번 째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 1) 20보다 작거나 같은 자연수 n 입력
// 2) n번 째 피보나치 수 출력
public class Ex02_fibonacci {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("20보다 작거나 같은 자연수 입력");
		System.out.print("-> ");
		int n = sc.nextInt(); // 자연수

		System.out.println(fibo(n));
	} // main method

	public static int fibo(int n) {
		int result = 0;

		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			// 재귀호출
			result = fibo(n - 1) + fibo(n - 2);
		}
		
		return result;
	} // fibo method
}
