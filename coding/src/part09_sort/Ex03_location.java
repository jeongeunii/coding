package part09_sort;

import java.util.Scanner;

// 좌표 정렬하기 (백준 11650번)
// 1) 점의 개수 N 입력
// 2) N개의 2차원 평면 위의 점 x, y 입력
// 3) 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬하여 출력
public class Ex03_location {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("점의 개수 입력 -> ");
		int n = sc.nextInt(); // 점의 개수
		int[] arrX = new int[n]; // 점의 x좌표 배열
		int[] arrY = new int[n]; // 점의 y좌표 배열

		System.out.println(n + "개의 점 입력 ->");
		for (int i = 0; i < n; i++) {
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();
		}

		for (int i = 0; i < arrX.length; i++) {
			for (int j = i + 1; j < arrX.length; j++) {
				// x좌표 오름차순 정렬
				if (arrX[i] > arrX[j]) {
					// x좌표와 y좌표가 한 쌍이므로 두 값 모두 바꿈
					int temp = arrX[i];
					arrX[i] = arrX[j];
					arrX[j] = temp;
					temp = arrY[i];
					arrY[i] = arrY[j];
					arrY[j] = temp;
				} else if (arrX[i] == arrX[j]) { // x좌표가 같을 경우
					// y좌표 오름차순 정렬
					if (arrY[i] > arrY[j]) {
						int temp = arrY[i];
						arrY[i] = arrY[j];
						arrY[j] = temp;
					}
				} // end of if
			}
		} // end of for

		for (int i = 0; i < arrX.length; i++) {
			System.out.println(arrX[i] + " " + arrY[i]);
		}
	}
}
