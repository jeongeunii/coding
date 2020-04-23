package example;

// 가장 큰 수
// 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
// 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이 중 가장 큰 수는 6210입니다.
// numbers => {6, 10, 2}
// return => 6210
public class Ex02_max {

	public static void main(String[] args) {

		int[] numbers = { 6, 10, 2 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				// 각 숫자의 맨 앞자리 수를 비교하여 큰 값이 맨 앞으로 오도록 정렬
				if (Integer.toString(numbers[i]).charAt(0) < Integer.toString(numbers[j]).charAt(0)) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		} // end of for

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		} // end of for
	}
}
