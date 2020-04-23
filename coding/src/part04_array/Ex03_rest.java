package part04_array;

import java.util.Scanner;

// �������� ���� �� (���� 3052��)
// 1) �ڿ��� 10���� �Է¹��� ��
// 2) �̸� 42�� ���� �������� ���Ѵ�.
// 3) �� ���� ���� �ٸ� ���� �� �� �ִ��� ���
// �Է� => 39 40 41 42 43 44 82 83 84 85
// �������� 39, 40, 41, 0, 1, 2, 40, 41, 0, 1
// ���� �ٸ� ���� 39, 40, 41, 0, 1, 2
// ��� => 6
public class Ex03_rest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = new int[10];

		a: while (true) {
			System.out.print("�ڿ��� 10�� �Է� -> ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] <= 0) {
					System.out.println("�ٽ� �Է��ϼ���!");
					// while������ ��� �ѱ�
					continue a;
				}
			} // end of for

			break;
		} // end of while

		int[] rest = new int[10];
		int cnt = 10; // ���� ���� ���ٰ� ������ �� �ʱⰪ 10 ����
		
		for (int i = 0; i < rest.length; i++) {
			rest[i] = arr[i] % 42;
			// ���� ����� ���Ͽ� ���� ���� ������ -1�� ���� �� cnt ����
			for (int j = 0; j < i; j++) {
				if(rest[i] == rest[j]) {
					rest[j] = -1;
					cnt--;
				}
			}
		} // end of for
		
		System.out.println(cnt);
	}
}
