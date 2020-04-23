package part04_array;

import java.util.Scanner;

// 숫자의 개수 (백준 2577번)
// 세 개의 자연수 A, B, C가 주어질 때 AxBxC를 계산한 결과에
// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램
// 입력 => 	A = 150
//		  	B = 266
//		  	C = 427
// 출력 =>	A x B x C = 17037300
//		  	0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
public class Ex02_numCount {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("A = ");
		int a = sc.nextInt();
		System.out.print("B = ");
		int b = sc.nextInt();
		System.out.print("C = ");
		int c = sc.nextInt();

		String result = (a * b * c) + "";
		int length = result.length();
		int[] cnt = new int[10];
		boolean flag = false;

		for (int i = 0; i < length; i++) {
			// charAt() : char값이 아스키코드 값으로 변환되기 때문에 오류
			// -> substring()을 사용하여 int로 형변환하여 사용
			cnt[Integer.parseInt(result.substring(i, i+1))]++;
		}

		// 150 266 427
		System.out.println("A x B x C = " + result);
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				// 처음 출력을 제외하고 앞에 콤마 출력
				if(flag) {
					System.out.print(", ");
				}
				System.out.print(i + "이 " + cnt[i] + "번");
				flag = true;
			}
		} // end of for
		System.out.print(" 쓰였다.");
	}
}
