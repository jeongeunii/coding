package part04_array;

import java.util.Scanner;

// 나머지가 같은 값 (백준 3052번)
// 1) 자연수 10개를 입력받은 뒤
// 2) 이를 42로 나눈 나머지를 구한다.
// 3) 그 다음 서로 다른 값이 몇 개 있는지 출력
// 입력 => 39 40 41 42 43 44 82 83 84 85
// 나머지는 39, 40, 41, 0, 1, 2, 40, 41, 0, 1
// 서로 다른 값은 39, 40, 41, 0, 1, 2
// 출력 => 6
public class Ex03_rest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = new int[10];

		a: while (true) {
			System.out.print("자연수 10개 입력 -> ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] <= 0) {
					System.out.println("다시 입력하세요!");
					// while문으로 제어를 넘김
					continue a;
				}
			} // end of for

			break;
		} // end of while

		int[] rest = new int[10];
		int cnt = 10; // 같은 값이 없다고 가정한 후 초기값 10 설정
		
		for (int i = 0; i < rest.length; i++) {
			rest[i] = arr[i] % 42;
			// 전의 값들과 비교하여 같은 값이 있으면 -1로 변경 후 cnt 감소
			for (int j = 0; j < i; j++) {
				if(rest[i] == rest[j]) {
					rest[j] = -1;
					cnt--;
				}
			}
		} // end of for
		
		System.out.println(cnt);
	}
}
