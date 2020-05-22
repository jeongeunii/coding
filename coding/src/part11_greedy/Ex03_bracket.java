package part11_greedy;

import java.util.Scanner;

// 잃어버린 괄호 (백준 1541번)
// 양수와 +, - 를 가지고 식을 만든다.
// 괄호를 적절히 쳐서 이 식의 값을 최소로 만드려고 한다.
// 1) 식 입력
//  (식은 0~9, +, - 만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자다.
//   연속해서 두 개 이상의 연산자가 나타나지 않는다.)
// 2) 이 식의 값의 최솟값 출력
public class Ex03_bracket {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("식 입력 -> ");
		String str = sc.nextLine(); // 식
		String cal = ""; // 연산(+,-)할 식
		String[] calArr = null; // 연산자 제외한 숫자 담는 배열
		int index = 0; // 연산자 "-" index 주소
		int negValue = 0; // 빼기 값
		int posValue = 0; // 더하기 값

		index = str.indexOf("-"); // 연산자 "-" index 주소

		// 연산자 "-"가 나온 뒤의 값은 모두 빼기 값으로 계산하면 되므로
		// 연산자 "-"가 나오기 전 값은 모두 더하기 값
		// 더하기 값 계산
		if (index == -1) { // 연산자 "-"가 존재하지 않는 경우
			cal = str; // 모두 연산
		} else { // 연산자 "-"가 존재하는 경우
			cal = str.substring(0, index); // 연산자 "-" 등장 전까지 연산
		}

		// 연산자 "+"를 기준으로 문자들을 구분하여 배열에 저장
		calArr = cal.split("\\+");
		for (int i = 0; i < calArr.length; i++) {
			posValue += Integer.parseInt(calArr[i]); // 모두 더하기 값에 저장
		}

		// 빼기 값 계산
		if (index != -1) { // 연산자 "-"가 존재하는 경우
			cal = str.substring(index + 1); // 연산자 "-" 등장 후부터 모두 연산

			// 연산자 "+" 또는 "-"를 기준으로 구분
			calArr = cal.split("\\+|\\-");
			for (int i = 0; i < calArr.length; i++) {
				negValue += Integer.parseInt(calArr[i]); // 모두 빼기 값에 저장
			}
		}

		System.out.println(posValue - negValue); // 더하기 값 - 빼기 값
	}
}
