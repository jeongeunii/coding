package part05_function;

import java.util.Scanner;

// �Ѽ� (���� 1065��)
// � ���� ���� n�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�.
// n�� �־����� ��, 1���� ũ�ų� ���� n���� �۰ų� ���� �Ѽ��� ���� ���
public class Ex02_sequence {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0; // ���� ����
		int result = 0; // �Ѽ��� ����

		System.out.print("���� ���� �Է� -> ");
		n = sc.nextInt();

		if (n < 100) { // ������ 100���� ���� ��� ��� ���� �Ѽ�
			result = n;
		} else { // ������ 100���� ũ�ų� ���� ���
			result = 99; // �ʱ� ���� 99��
			String str = "";
			// 100���� n���� ���� �˻� ����
			a: for (int i = 100; i <= n; i++) {
				str = Integer.toString(i);
				for (int j = 0; j < str.length() - 2; j++) {
					// ������ �ƴ� ��� a:for�� ���� �ѱ�
					if ((str.charAt(j + 1) - str.charAt(j)) != (str.charAt(j + 2) - str.charAt(j + 1))) {
						continue a;
					}
				}
				result++; // ������ ���
			} // end of a:for
		} // end of if

		System.out.println(result);
	}
}