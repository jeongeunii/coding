package part09_sort;

import java.util.Scanner;

// 소트 인사이드 (백준 1427번)
// 1) 자연수 N 입력
// 2) 각 자리 수를 내림차순으로 정렬하여 출력
public class Ex02_sortInside {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("자연수 입력 -> ");
		String str = sc.next(); // 자연수
		int[] arr = new int[str.length()]; // 내림차순 배열

		for (int i = 0; i < str.length(); i++) {
			// String값 하나씩 쪼개서 배열에 저장
			arr[i] = Integer.parseInt(str.substring(i, i + 1));
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 내림차순 정렬
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} // end of for

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
