package part07_math;

import java.util.Scanner;

// 벌집 (백준 2292번)
// 육각형으로 이루어진 벌집이 있다.
// 1) 숫자 N 입력
// 2) 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지 출력
public class Ex03_honeycomb {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("숫자 입력 -> ");
		int n = sc.nextInt(); // 숫자
		int cnt = 0; // 지나가는 방 개수
		int std = 1; // 같은 라인의 방 개수

		// 중앙으로부터 방의 개수가 6의 배수만큼 증가
		while (n > std) {
			std += 6 * ++cnt;
		}

		System.out.println(++cnt);
	}
}
