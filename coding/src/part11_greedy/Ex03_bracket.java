package part11_greedy;

import java.util.Scanner;

// �Ҿ���� ��ȣ (���� 1541��)
// ����� +, - �� ������ ���� �����.
// ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ������� �Ѵ�.
// 1) �� �Է�
//  (���� 0~9, +, - ������ �̷���� �ְ�, ���� ó���� ������ ���ڴ� ���ڴ�.
//   �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʴ´�.)
// 2) �� ���� ���� �ּڰ� ���
public class Ex03_bracket {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�� �Է� -> ");
		String str = sc.nextLine(); // ��
		String cal = ""; // ����(+,-)�� ��
		String[] calArr = null; // ������ ������ ���� ��� �迭
		int index = 0; // ������ "-" index �ּ�
		int negValue = 0; // ���� ��
		int posValue = 0; // ���ϱ� ��

		index = str.indexOf("-"); // ������ "-" index �ּ�

		// ������ "-"�� ���� ���� ���� ��� ���� ������ ����ϸ� �ǹǷ�
		// ������ "-"�� ������ �� ���� ��� ���ϱ� ��
		// ���ϱ� �� ���
		if (index == -1) { // ������ "-"�� �������� �ʴ� ���
			cal = str; // ��� ����
		} else { // ������ "-"�� �����ϴ� ���
			cal = str.substring(0, index); // ������ "-" ���� ������ ����
		}

		// ������ "+"�� �������� ���ڵ��� �����Ͽ� �迭�� ����
		calArr = cal.split("\\+");
		for (int i = 0; i < calArr.length; i++) {
			posValue += Integer.parseInt(calArr[i]); // ��� ���ϱ� ���� ����
		}

		// ���� �� ���
		if (index != -1) { // ������ "-"�� �����ϴ� ���
			cal = str.substring(index + 1); // ������ "-" ���� �ĺ��� ��� ����

			// ������ "+" �Ǵ� "-"�� �������� ����
			calArr = cal.split("\\+|\\-");
			for (int i = 0; i < calArr.length; i++) {
				negValue += Integer.parseInt(calArr[i]); // ��� ���� ���� ����
			}
		}

		System.out.println(posValue - negValue); // ���ϱ� �� - ���� ��
	}
}
