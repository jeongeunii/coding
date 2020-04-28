package part06_string;

import java.util.Scanner;

// ũ�ξ�Ƽ�� ���ĺ� (���� 2941��)
// ũ�ξ�Ƽ�� ���ĺ� ���� �� : c=, c-, dz=, d-, lj, nj, s=, z= (�������� ���ĺ� �״��)
// 1) �ܾ� �Է� (���ĺ� �ҹ���, -, = �θ� �̷���� �ִ�)
// 2) �־��� �ܾ �� ���� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ��� ���
public class Ex08_croatia {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�ܾ� �Է� -> ");
		String str = sc.next(); // �ܾ�
		int leng = 0; // ũ�ξ�Ƽ�� ���ĺ��� ����
		int index = 0; // ũ�ξ�Ƽ�� ���ĺ� ù ���� �ε���
		int cnt = 0; // ũ�ξ�Ƽ�� ���ĺ� ����
		// ũ�ξ�Ƽ�� ���ĺ� �迭
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		// ũ�ξ�Ƽ�� ���ĺ� �迭 �ϳ��� �˻�
		for (int i = 0; i < arr.length; i++) {
			// �ش� ũ�ξ�Ƽ�� ���ĺ��� �ܾ �����ϴ� ���� ����
			while (str.indexOf(arr[i]) != -1) {
				// �� �̻� �������� ������ while�� ����
				if (str.indexOf(arr[i]) == -1) {
					break;
				}
				leng = arr[i].length();
				index = str.indexOf(arr[i]);
				// ���� ���� ���̸� �� ���ο� �ܾ ������ �� �ֱ� ������ ���̿� ���� ����
				str = str.substring(0, index) + " " + str.substring(index + leng);
				// ũ�ξ�Ƽ�� ���ĺ� ���� ����
				cnt++;
			}
		}

		// ��� ���� ����
		str = str.replace(" ", "");
		// ũ�ξ�Ƽ�� ���ĺ� ������ ����
		cnt += str.length();

		System.out.println(cnt);
	}
}
