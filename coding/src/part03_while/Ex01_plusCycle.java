package part03_while;

import java.util.Scanner;

// ���ϱ� ����Ŭ (���� 1110��)
// 1) 0���� ũ�ų� ����, 99���� �۰ų� ���� ���� �Է�
// 2) �Է��� ������ 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�.
// 3) �Է��� ������ ���� ������ �ڸ� ���� ���� ���� ������ �ڸ� ���� �̾� �ٿ� ���ο� ���� �����.
// 4) ���ο� ���� �Է��� ������ ������ �� ���� �ݺ�
// 5) ����Ŭ�� ���� ���
// �Է� => 26    55    1
// ��� => 4     3     60
public class Ex01_plusCycle {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		int newNum = 0;
		int cnt = 0;

		while (true) {
			System.out.print("0���� ũ�ų� ����, 99���� �۰ų� ���� ���� �Է� -> ");
			num = sc.nextInt();

			if (num >= 0 && num <= 99) {
				newNum = num;
				break;
			}

			System.out.println("�ٽ� �Է��ϼ���!");

		} // end of while

		do {
			// sum : �� �ڸ����� ���� ��
			sum = newNum / 10 + newNum % 10;
			// newNum : �Է��� ������ ���� ������ �ڸ� ���� ��(sum)�� ���� ������ �ڸ� ���� �̾� ���� ��
			newNum = (newNum % 10) * 10 + sum % 10;
			// cnt : ����Ŭ ����
			cnt++;
		} while (num != newNum); // �Է��� ������ ���� ���� ���� ���� ������ �ݺ�

		System.out.println(cnt);
	}
}
