package part04_array;

import java.util.Arrays;
import java.util.Scanner;

// �ּڰ� �ִ� (���� 10818��)
// 1) ������ ����(N) �Է�
// 2) N���� ���� �Է�
// 3) �־��� ���� N���� �ּڰ��� �ִ� ���
public class Ex01_minMax {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0;

		while (true) {
			System.out.print("������ ���� �Է� -> ");
			n = sc.nextInt();

			if (n != 0) {
				break;
			}

			System.out.println("�ٽ� �Է��ϼ���!");
		} // end of while

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("�ּڰ� -> " + arr[0]);
		System.out.println("�ִ� -> " + arr[n - 1]);
	}
}
