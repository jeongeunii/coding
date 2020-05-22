package part10_dynamic;

import java.util.Scanner;

// �Ǻ���ġ �� (���� 2748��)
// �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0�� ° �Ǻ���ġ ���� 0�̰�, 1�� ° �Ǻ���ġ ���� 1�̴�.
// 2�� ° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
// 1) 90���� �۰ų� ���� �ڿ��� n �Է�
// 2) n�� ° �Ǻ���ġ �� ���
public class Ex01_fibonacci {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("90���� �۰ų� ���� �ڿ��� �Է� -> ");
		int n = sc.nextInt(); // �ڿ���
		int a = 0, b = 1, c = 0; // 0�� °, 1�� °, 2�� ° �Ǻ���ġ �� �ʱ�ȭ ��
		int result = 0; // �Ǻ���ġ ��

		if (n == 1) { // �ڿ����� 1�� ���
			result = n;
		} else { // �ڿ����� 2 �̻��� ���
			for (int i = 1; i < n; i++) {
				// �ٷ� �� �� �Ǻ���ġ ���� ���� ���� �� ���� �� �Ǻ���ġ �� ������Ʈ
				c = a + b;
				a = b;
				b = c;
			}
			result = c;
		} // end of if

		System.out.println(result);
	}
}
