package part09_sort;

import java.util.Scanner;

// ���̼� ���� (���� 10814��)
// 1) ȸ�� �� N �Է�
// 2) N���� ȸ�� ����, �̸� �Է�
// 3) ȸ���� ���� ��, ���̰� ������ ������ ������ ���
public class Ex04_age {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("ȸ�� �� �Է� -> ");
		int n = sc.nextInt(); // ȸ�� ��
		int[] cnt = new int[n]; // ȸ�� ���� ���� �迭
		int[] age = new int[n]; // ȸ�� ���� �迭
		String[] name = new String[n]; // ȸ�� �̸� �迭

		System.out.println(n + "���� ȸ�� ����, �̸� �Է� ->");
		for (int i = 0; i < n; i++) {
			cnt[i] = i;
			age[i] = sc.nextInt();
			name[i] = sc.next();
		}

		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				// ���� �������� �迭
				// �Ǵ� ���̰� ���� ��� ���� ���� �������� �迭
				if ((age[i] > age[j]) || ((age[i] == age[j]) && (cnt[i] > cnt[j]))) {
					// �� ����� ������ ����, �̸�, ���Լ��� ��� �ٲ�
					int temp = age[i];
					age[i] = age[j];
					age[j] = temp;
					String tem = name[i];
					name[i] = name[j];
					name[j] = tem;
					temp = cnt[i];
					cnt[i] = cnt[j];
					cnt[j] = temp;
				}
			}
		} // end of for

		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i] + " " + name[i]);
		}
	}
}
