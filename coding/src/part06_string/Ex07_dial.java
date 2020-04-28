package part06_string;

import java.util.Scanner;

// 다이얼 (백준 5622번)
// 전화를 걸고 싶은 번호가 있다면, 숫자를 하나 누른 다음에 금속 핀이 있는 곳까지 시계방향으로 돌려야 한다.
// 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자는 다이얼 처음 위치에서 다시 돌려야한다.
// 숫자 1을 걸려면 총 2초가 필요하다. 한 칸 옆 숫자는 1초씩 더 걸린다.
// 각 숫자에 해당하는 문자로 다이얼을 건다.
// ABC - 2, DEF - 3, GHI - 4, JKL - 5, MNO - 6, PQRS - 7, TUV - 8, WXYZ - 9
// 1) 알파벳 대문자로 이루어진 단어 입력
// 2) 다이얼을 걸기 위해서 필요한 시간 출력
public class Ex07_dial {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("단어 입력 -> ");
		String str = sc.next(); // 알파벳 대문자로 이루어진 단어
		int time = 0; // 필요한 시간
		// 각 알파벳을 걸기 위해서 필요한 시간 배열
		int[] arr = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

		// 각 문자의 아스키코드 값을 가져와서 그에 알맞은 arr 배열의 값을 시간에 더함
		for (int i = 0; i < str.length(); i++) {
			time += arr[(char) str.charAt(i) - 65];
		}

		System.out.println(time);
	}
}
