package part07_math;

import java.util.Scanner;

// ���� (���� 2292��)
// ���������� �̷���� ������ �ִ�.
// 1) ���� N �Է�
// 2) ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ���������� ���
public class Ex03_honeycomb {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� �Է� -> ");
		int n = sc.nextInt(); // ����
		int cnt = 0; // �������� �� ����
		int std = 1; // ���� ������ �� ����

		// �߾����κ��� ���� ������ 6�� �����ŭ ����
		while (n > std) {
			std += 6 * ++cnt;
		}

		System.out.println(++cnt);
	}
}
