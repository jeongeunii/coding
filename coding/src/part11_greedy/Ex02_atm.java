package part11_greedy;

import java.util.Arrays;
import java.util.Scanner;

// ATM (백준 11399번)
// 은행에는 ATM이 1대 밖에 없다. 이 ATM 앞에 N명의 사람들이 줄을 서있다.
// 사람은 1번부터 N번까지 번호가 매겨져 있으며
// 각 사람들이 돈을 인출하는데 걸리는 시간이 주어진다.
// 뒷 사람은 앞 사람(들)이 돈을 인출하는데 걸리는 시간만큼 기다려야 한다.
// N명의 사람이 모두 돈을 인출하는데 필요한 시간의 합의 최소를 구하는 프로그램
// 1) 사람의 수 N 입력
// 2) 각 사람이 돈을 인출하는데 걸리는 시간 입력
// 3) 시간의 합의 최솟값 출력
public class Ex02_atm {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("사람의 수 입력 -> ");
		int n = sc.nextInt(); // 사람 수
		int[] arr = new int[n]; // 인출 시간 배열
		int relay = 0; // 기다리는 시간
		int total = 0; // 시간의 합

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			// 시간의 합에 (기다린 시간 + 자기 자신 인출 시간) 더하고
			// 다음 사람 기다린 시간 업데이트
			total += (relay + arr[i]);
			relay += arr[i];
		}

		System.out.println(total);
	}
}
