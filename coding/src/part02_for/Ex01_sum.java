package part02_for;

import java.util.Scanner;

// A+B를 여러 번 출력 (11022번)
// 1) 케이스의 개수 T 입력
// 2) T만큼 두 정수 입력 (0<A,B<10)
// 3) 두 정수의 합 출력
public class Ex01_sum {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		int[] a = null;
		int[] b = null;

		while (true) {
			System.out.print("케이스 개수 입력 -> ");
			num = sc.nextInt();
			a = new int[num];
			b = new int[num];

			if (num != 0) {
				break;
			}
			
			System.out.println("케이스 개수를 다시 입력하세요!");
		} // end of while
		
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			
			if (a[i] <= 0 || a[i] >= 10 || b[i] <= 0 || b[i] >= 10) {
				System.out.println("두 정수를 다시 입력하세요!");
				i--;
			} // end of if
			
		} // end of for
		
		for (int i = 0; i < num; i++) {
			System.out.println("Case #" + (i + 1) + ": " + (a[i] + b[i]));
		}
	}
}
