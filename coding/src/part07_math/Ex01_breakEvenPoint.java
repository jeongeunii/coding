package part07_math;

import java.util.Scanner;

// 손익분기점 (백준 1712번)
// 노트북을 생산하는데 A만원의 고정 비용, B만원의 가변 비용이 든다고 할 때
// 노트북 한 대 생성하는 데는 총 (A + B)만원이 들며, 열 대 생성하는 데는 총 (A + B*10)만원이 든다.
// 노트북 가격이 C만원으로 책정되었다고 한다.
// 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(고정비용 + 가변비용)보다 많아지게 된다.
// 최초로 총 수입이 총 비용보다 많아지는 지점을 손익분기점이라고 한다.
// 1) 고정 비용 A, 가변 비용 B, 판매 비용 C 입력
// 2) 손익분기점이 발생하는 판매량 출력 (존재하지 않으면 -1 출력)
public class Ex01_breakEvenPoint {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("고정 비용, 가변 비용, 판매 비용 입력");
		System.out.print("-> ");
		int a = sc.nextInt(); // 고정 비용
		int b = sc.nextInt(); // 가변 비용
		int c = sc.nextInt(); // 판매 비용
		int n = 0; // 손익분기점이 발생하는 판매량

		while (true) {
			// 손익분기점이 발생하면 while문 종료
			if (a + n * b < c * n) {
				break;
			}
			// 손익분기점이 발생하지 않으면 판매량 증가
			n++;
		}

		System.out.println(n);
	}
}
