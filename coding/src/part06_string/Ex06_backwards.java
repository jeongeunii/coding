package part06_string;

import java.util.Scanner;

// �Ųٷ� �� (���� 2908��)
// 1) ���� ���� �� �ڸ� ���� 2�� �Է� (0�� ���ԵǾ� ���� ����)
// 2) �� ������ �Ųٷ� �а� �� ū �� ���
public class Ex06_backwards {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("�� �ڸ� ���� 2�� �Է� -> ");
		String str1 = sc.next(); // �� �ڸ� ����
		String str2 = sc.next(); // �� �ڸ� ����
		String result = ""; // �� ū ��

		// �� ������ �Ųٷ� �ٽ� ����
		str1 = str1.substring(2) + str1.substring(1, 2) + str1.substring(0, 1) + "";
		str2 = str2.substring(2) + str2.substring(1, 2) + str2.substring(0, 1) + "";
		
		if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
			result = str1;
		} else {
			result = str2;
		}
		
		System.out.println(result);
	}
}
