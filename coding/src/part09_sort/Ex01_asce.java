package part09_sort;

import java.util.Arrays;
import java.util.Scanner;

// 오름차순 정렬 (백준 2750번)
// 1) 수의 개수 N 입력
// 2) N개의 정수 입력 (수는 중복되지 않는다)
// 3) 오름차순 정렬하여 출력
public class Ex01_asce {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("수의 개수 입력 -> ");
		int n = sc.nextInt(); // 수의 개수
		int[] arr = new int[n]; // 오름차순 배열
		int[] arr2 = new int[n]; // 내림차순 배열

		System.out.print(n + "개의 정수 입력 (중복 X) -> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 오름차순 정렬
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// 내림차순 정렬
				if (arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		} // end of for

		System.out.print("오름차순 : ");
		System.out.println(Arrays.toString(arr));
		System.out.print("내림차순 : ");
		System.out.println(Arrays.toString(arr2));
	}
}
