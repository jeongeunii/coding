package part06_string;

import java.util.Scanner;

// ���� ���� ���� ���ĺ� (���� 1157��)
// 1) ���ĺ� ��ҹ��ڷ� �̷���� �ܾ� �Է�
// 2) �� �ܾ�� ���� ���� ���� ���ĺ� ���
// 3) ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��� ? ���
public class Ex04_mostUsed {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�ܾ� �Է� -> ");
		String str = sc.next(); // ��ҹ��ڷ� �̷���� �ܾ�
		// ��� ���ڸ� �ҹ��ڷ� ����
		str = str.toLowerCase();
		int[] arr = new int[26]; // ���ĺ� ���� Ƚ�� �迭
		int max = 0; // ���� Ƚ�� �ִ�
		int index = 0; // �ִ��� �ε���
		boolean flag = false; // ���� ���� ���� ���ĺ��� ���� �� �����ϴ��� ����

		// �ܾ��� �� ���ĺ��� ���� Ƚ�� ����
		for (int i = 0; i < str.length(); i++) {
			arr[(int) str.charAt(i) - 97]++;
		}

		// ���� Ƚ�� �ִ񰪰� �ε��� ����
		for (int i = 0; i < arr.length; i++) {
			// �迭�� ���� 0�� �ƴ� ��츸 ����
			if (arr[i] != 0) {
				if (arr[i] > max) { // max���� ū ���
					max = arr[i];
					index = i;
					flag = false;
				} else if (arr[i] == max) { // max�� ���� ���
					flag = true; // ���� ���� ���� ���ĺ��� ���� �� ������
				}
			}
		}

		if (flag) {
			System.out.println("?");
		} else {
			System.out.println((char) (index + 97));
		}
	}
}
