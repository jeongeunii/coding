package part04_array;

import java.util.Scanner;

// 평균 이상 비율 (백준 4344번)
// 1) 테스트 케이스의 개수 입력
// 2) 학생 수(N), N명의 점수 입력
// 3) 각 케이스마다 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
public class Ex05_average {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int test = 0; // 테스트 케이스 개수
		int n = 0; // 학생 수
		int[] score = null; // 점수 배열
		int sum = 0; // 점수 합
		double avg = 0; // 점수 평균
		int cnt = 0; // 평균 이상 학생 수
		String[] result = null; // 학생 비율 배열

		System.out.print("테스트 케이스 개수 입력 -> ");
		test = sc.nextInt();
		result = new String[test];

		System.out.print("학생 수와 점수 입력 -> ");
		for (int i = 0; i < test; i++) {
			// 테스트 케이스마다 초기화
			sum = 0;
			cnt = 0;
			
			n = sc.nextInt();
			score = new int[n];
			
			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = sum / n;

			for (int j = 0; j < score.length; j++) {
				if (score[j] > avg) {
					cnt++;
				}
			}
			
			// %.3f : 소수점 셋째 자리까지 반올림
			result[i] = String.format("%.3f", (double) cnt * 100 / n) + "%";
			
		} // end of for
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
