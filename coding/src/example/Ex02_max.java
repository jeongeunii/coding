package example;

// ���� ū ��
// 0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
// ���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, �� �� ���� ū ���� 6210�Դϴ�.
// numbers => {6, 10, 2}
// return => 6210
public class Ex02_max {

	public static void main(String[] args) {

		int[] numbers = { 6, 10, 2 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				// �� ������ �� ���ڸ� ���� ���Ͽ� ū ���� �� ������ ������ ����
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
