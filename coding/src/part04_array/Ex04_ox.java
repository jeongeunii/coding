package part04_array;

import java.util.Scanner;

// OX���� (���� 8958��)
// O�� ������ ���� ���̰�, X�� ������ Ʋ�� ��
// ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
// OOXXOXXOOO�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
// 1) �׽�Ʈ ���̽��� ���� �Է�
// 2) ���̽� ������ŭ ���ڿ� �Է�(���ڿ��� O�� X������ �̷���� ����)
// 3) ���� ���
public class Ex04_ox {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0; // �׽�Ʈ ���̽� ����
		int[] score = null; // ���� �迭
		String str = ""; // ���ڿ�
		int result = 0; // ���� ����

		System.out.print("�׽�Ʈ ���̽� ���� �Է� -> ");
		n = sc.nextInt();
		score = new int[n];

		System.out.print(n + "���� ���ڿ� �Է� -> ");
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'O') { // i��° ���ڰ� 'O'�� ���
				if (i == 0) { // ù ��° ������ ��� ���� ������ ���� ���� ������ 1�� �ο�
					score[i] = 1;
				} else {
					if (str.charAt(i - 1) == 'O') { // ������ ���� 'O'�� ���
						score[i] = score[i - 1] + 1;
					} else { // ������ ���� 'O'�� �ƴ� ���
						score[i] = 1;
					}
				}
				result += score[i];
			} // end of if
		} // end of for

		System.out.println(result);
	}
}
