package part11_greedy;

import java.util.Scanner;

// ���� (���� 11047��)
// 1) �ݾ� K �Է�
// 2) K���� ����µ� �ʿ��� ������ �ּ� ���� ���
public class Ex01_coin {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�ݾ� �Է� -> ");
		int k = sc.nextInt(); // �ݾ�
		int[] arr = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 }; // ���� �迭
		int cnt = 0; // ������ �ּ� ����

		while (k > 0) { // �ݾ��� 0���� Ŭ ���� ����
			// �ݾ��� ū �������� ����
			for (int i = arr.length - 1; i >= 0; i--) {
				while (k >= arr[i]) { // �ݾ��� ���� �ݾ׺��� Ŭ ���� ����
					k -= arr[i];
					cnt++;
				}
			}
		} // end of while

		System.out.println(cnt);
	}
}
