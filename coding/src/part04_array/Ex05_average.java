package part04_array;

import java.util.Scanner;

// ��� �̻� ���� (���� 4344��)
// 1) �׽�Ʈ ���̽��� ���� �Է�
// 2) �л� ��(N), N���� ���� �Է�
// 3) �� ���̽����� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ���
public class Ex05_average {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int test = 0; // �׽�Ʈ ���̽� ����
		int n = 0; // �л� ��
		int[] score = null; // ���� �迭
		int sum = 0; // ���� ��
		double avg = 0; // ���� ���
		int cnt = 0; // ��� �̻� �л� ��
		String[] result = null; // �л� ���� �迭

		System.out.print("�׽�Ʈ ���̽� ���� �Է� -> ");
		test = sc.nextInt();
		result = new String[test];

		System.out.print("�л� ���� ���� �Է� -> ");
		for (int i = 0; i < test; i++) {
			// �׽�Ʈ ���̽����� �ʱ�ȭ
			sum = 0;
			cnt = 0;
			
			n = sc.nextInt();
			score = new int[n];
			
			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = sum / n;

			for (int j = 0; j < score.length; j++) {
				if (score[j] > avg) {
					cnt++;
				}
			}
			
			// %.3f : �Ҽ��� ��° �ڸ����� �ݿø�
			result[i] = String.format("%.3f", (double) cnt * 100 / n) + "%";
			
		} // end of for
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
