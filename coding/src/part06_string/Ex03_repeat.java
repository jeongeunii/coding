package part06_string;

import java.util.Scanner;

// ���ڿ� �ݺ� (���� 2675��)
// 1) �׽�Ʈ ���̽� ���� �Է�
// 2) ���̽� �ݺ� Ƚ���� ���ڿ� �Է�
// 3) ���ڿ��� �� ���ڸ� Ƚ����ŭ �ݺ��Ͽ� ���
// �Է� => 3 abc
// ��� => aaabbbccc
public class Ex03_repeat {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�׽�Ʈ ���̽� ���� �Է� -> ");
		int cnt = sc.nextInt(); // �׽�Ʈ ���̽� ����
		int[] repeat = new int[cnt]; // ���̽� �ݺ� Ƚ�� �迭
		String[] str = new String[cnt]; // ���ڿ� �迭

		System.out.print("���̽� �ݺ� Ƚ��, ���ڿ� �Է� -> ");
		for (int i = 0; i < cnt; i++) {
			repeat[i] = sc.nextInt();
			str[i] = sc.next();
		}

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				for (int k = 0; k < repeat[i]; k++) {
					System.out.print(str[i].charAt(j));
				}
			}
			System.out.println();
		} // end of for
	}
}
