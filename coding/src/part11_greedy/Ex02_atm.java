package part11_greedy;

import java.util.Arrays;
import java.util.Scanner;

// ATM (���� 11399��)
// ���࿡�� ATM�� 1�� �ۿ� ����. �� ATM �տ� N���� ������� ���� ���ִ�.
// ����� 1������ N������ ��ȣ�� �Ű��� ������
// �� ������� ���� �����ϴµ� �ɸ��� �ð��� �־�����.
// �� ����� �� ���(��)�� ���� �����ϴµ� �ɸ��� �ð���ŭ ��ٷ��� �Ѵ�.
// N���� ����� ��� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּҸ� ���ϴ� ���α׷�
// 1) ����� �� N �Է�
// 2) �� ����� ���� �����ϴµ� �ɸ��� �ð� �Է�
// 3) �ð��� ���� �ּڰ� ���
public class Ex02_atm {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("����� �� �Է� -> ");
		int n = sc.nextInt(); // ��� ��
		int[] arr = new int[n]; // ���� �ð� �迭
		int relay = 0; // ��ٸ��� �ð�
		int total = 0; // �ð��� ��

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// �������� ����
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			// �ð��� �տ� (��ٸ� �ð� + �ڱ� �ڽ� ���� �ð�) ���ϰ�
			// ���� ��� ��ٸ� �ð� ������Ʈ
			total += (relay + arr[i]);
			relay += arr[i];
		}

		System.out.println(total);
	}
}
