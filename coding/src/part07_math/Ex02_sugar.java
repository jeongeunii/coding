package part07_math;

import java.util.Scanner;

// ���� ��� (���� 2839��)
// ���� ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
// �ִ��� ���� ������ ��� ������ �Ѵ�.
// 1) ���� ų�α׷� �� N �Է�
// 2) ����ϴ� ������ �ּ� ���� ��� (���� ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1 ���)
public class Ex02_sugar {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� ų�α׷� �� �Է� -> ");
		int n = sc.nextInt(); // ���� ų�α׷� ��
		int cnt = 0; // ������ ����
		boolean flag = false; // ó�� ���� 5���� ���� ��츦 �к��ϱ� ���� �÷��� ����

		if (n % 5 == 0) { // �ּ� ������ ���ؾ��ϱ� ������ 5�� ������ �������� ��� ���� �˻�
			cnt = n / 5;
		} else {
			while (true) {
				if (n >= 5) { // 5���� ū ���
					n -= 5;
					cnt++;
					flag = true;
				} else if (n == 3) { // ���� �� �Ǵ� ó�� ���� 3�� ���
					cnt++;
					break;
				} else if (flag && (n + 5) % 3 == 0) {
					// ó�� ���� 5���� ũ�� n+5 ���� 3���� ������ ������ ���
					// �ٽ� �������� �ǵ��� ��(n+5) 3���� ����
					n += 5;
					cnt = cnt - 1 + n / 3;
					break;
				} else { // �� �� ��Ȯ�ϰ� ų�α׷� ���� ���� �� ���� ���
					cnt = -1;
					break;
				}
			} // end of while
		} // end of if
		
		System.out.println(cnt);
	}
}
