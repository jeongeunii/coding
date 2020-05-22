package part09_sort;

import java.util.Arrays;
import java.util.Scanner;

// �������� ���� (���� 2750��)
// 1) ���� ���� N �Է�
// 2) N���� ���� �Է� (���� �ߺ����� �ʴ´�)
// 3) �������� �����Ͽ� ���
public class Ex01_asce {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� ���� �Է� -> ");
		int n = sc.nextInt(); // ���� ����
		int[] arr = new int[n]; // �������� �迭
		int[] arr2 = new int[n]; // �������� �迭

		System.out.print(n + "���� ���� �Է� (�ߺ� X) -> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// �������� ����
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// �������� ����
				if (arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		} // end of for

		System.out.print("�������� : ");
		System.out.println(Arrays.toString(arr));
		System.out.print("�������� : ");
		System.out.println(Arrays.toString(arr2));
	}
}
