package part07_math;

import java.util.Scanner;

// �м� ã�� (���� 1193��)
// �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> 1/3 -> 1/4 -> 2/3 ->.. �� ����
// ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��,... �м���� �Ѵ�.
// 1) ���� X �Է�
// 2) X�� ° �м� ���
public class Ex04_fraction {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� �Է� -> ");
		int num = sc.nextInt(); // ����
		int inc = 2; // ������
		int val = 1; // ���� ���� �м��� ��ġ �ִ�
		int sum = 2; // ���ڿ� �и��� ��
		int result = 0; // ���ڿ� �и� �� ū ��

		while (true) {
			// �м��� ��ġ�� �ľ��� ��� while�� ����
			if (num <= val) {
				break;
			}
			val += inc++;
			sum++;
		} // end of while

		result = sum - 1; // ���� ū ���� ��-1
		// ���ڿ� �˸��� �м� ��ġ Ž��
		while (num != val) {
			result--;
			num++;
		}

		if (sum % 2 == 0) {
			System.out.println((sum - result) + "/" + result);
		} else {
			System.out.println(result + "/" + (sum - result));
		}
	}
}
