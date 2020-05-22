package part09_sort;

import java.util.Scanner;

// 나이순 정렬 (백준 10814번)
// 1) 회원 수 N 입력
// 2) N개의 회원 나이, 이름 입력
// 3) 회원을 나이 순, 나이가 같으면 가입한 순으로 출력
public class Ex04_age {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("회원 수 입력 -> ");
		int n = sc.nextInt(); // 회원 수
		int[] cnt = new int[n]; // 회원 가입 순서 배열
		int[] age = new int[n]; // 회원 나이 배열
		String[] name = new String[n]; // 회원 이름 배열

		System.out.println(n + "명의 회원 나이, 이름 입력 ->");
		for (int i = 0; i < n; i++) {
			cnt[i] = i;
			age[i] = sc.nextInt();
			name[i] = sc.next();
		}

		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				// 나이 오름차순 배열
				// 또는 나이가 같은 경우 가입 순서 오름차순 배열
				if ((age[i] > age[j]) || ((age[i] == age[j]) && (cnt[i] > cnt[j]))) {
					// 한 사람의 정보인 나이, 이름, 가입순서 모두 바꿈
					int temp = age[i];
					age[i] = age[j];
					age[j] = temp;
					String tem = name[i];
					name[i] = name[j];
					name[j] = tem;
					temp = cnt[i];
					cnt[i] = cnt[j];
					cnt[j] = temp;
				}
			}
		} // end of for

		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i] + " " + name[i]);
		}
	}
}
