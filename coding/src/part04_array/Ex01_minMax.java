package part04_array;

import java.util.Arrays;
import java.util.Scanner;

// 최솟값 최댓값 (백준 10818번)
// 1) 정수의 개수(N) 입력
// 2) N개의 정수 입력
// 3) 주어진 정수 N개의 최솟값과 최댓값 출력
public class Ex01_minMax {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0;

		while (true) {
			System.out.print("정수의 개수 입력 -> ");
			n = sc.nextInt();

			if (n != 0) {
				break;
			}

			System.out.println("다시 입력하세요!");
		} // end of while

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("최솟값 -> " + arr[0]);
		System.out.println("최댓값 -> " + arr[n - 1]);
	}
}
