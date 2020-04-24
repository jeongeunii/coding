package part05_function;

// ���� �ѹ� (���� 4673��)
// ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ��̴�.
// n�� d(n)�� �������̴�.
// �����ڰ� ���� ���ڸ� ���� �ѹ���� �Ѵ�.
// 100���� �۰ų� ���� ���� �ѹ� ���
public class Ex01_selfNumber {

	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 1; i <= arr.length; i++) {
			int num = d(i);
			// d(i)���� 100���� �۰ų� ���� ��� �迭 ���� -1 ����
			if (num <= 100) {
				arr[num - 1] = -1;
			}
		} // end of for

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				System.out.print((i + 1) + " ");
			}
		} // end of for

	} // main method

	// ���� ���� n�� ���ؼ� n�� n�� �� �ڸ����� ���ϴ� �Լ�
	public static int d(int n) {
		int result = n;
		String str = Integer.toString(n);

		for (int i = 0; i < str.length(); i++) {
			result += Integer.parseInt(str.substring(i, i + 1));
		}

		return result;
	} // d(n) method
}
