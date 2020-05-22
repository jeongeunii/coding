package part09_sort;

import java.util.Scanner;

// ��ǥ �����ϱ� (���� 11650��)
// 1) ���� ���� N �Է�
// 2) N���� 2���� ��� ���� �� x, y �Է�
// 3) ��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ �����Ͽ� ���
public class Ex03_location {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� ���� �Է� -> ");
		int n = sc.nextInt(); // ���� ����
		int[] arrX = new int[n]; // ���� x��ǥ �迭
		int[] arrY = new int[n]; // ���� y��ǥ �迭

		System.out.println(n + "���� �� �Է� ->");
		for (int i = 0; i < n; i++) {
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();
		}

		for (int i = 0; i < arrX.length; i++) {
			for (int j = i + 1; j < arrX.length; j++) {
				// x��ǥ �������� ����
				if (arrX[i] > arrX[j]) {
					// x��ǥ�� y��ǥ�� �� ���̹Ƿ� �� �� ��� �ٲ�
					int temp = arrX[i];
					arrX[i] = arrX[j];
					arrX[j] = temp;
					temp = arrY[i];
					arrY[i] = arrY[j];
					arrY[j] = temp;
				} else if (arrX[i] == arrX[j]) { // x��ǥ�� ���� ���
					// y��ǥ �������� ����
					if (arrY[i] > arrY[j]) {
						int temp = arrY[i];
						arrY[i] = arrY[j];
						arrY[j] = temp;
					}
				} // end of if
			}
		} // end of for

		for (int i = 0; i < arrX.length; i++) {
			System.out.println(arrX[i] + " " + arrY[i]);
		}
	}
}
