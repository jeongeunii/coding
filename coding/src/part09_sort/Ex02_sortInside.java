package part09_sort;

import java.util.Scanner;

// ��Ʈ �λ��̵� (���� 1427��)
// 1) �ڿ��� N �Է�
// 2) �� �ڸ� ���� ������������ �����Ͽ� ���
public class Ex02_sortInside {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�ڿ��� �Է� -> ");
		String str = sc.next(); // �ڿ���
		int[] arr = new int[str.length()]; // �������� �迭

		for (int i = 0; i < str.length(); i++) {
			// String�� �ϳ��� �ɰ��� �迭�� ����
			arr[i] = Integer.parseInt(str.substring(i, i + 1));
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// �������� ����
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} // end of for

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
