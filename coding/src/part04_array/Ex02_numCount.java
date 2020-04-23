package part04_array;

import java.util.Scanner;

// ������ ���� (���� 2577��)
// �� ���� �ڿ��� A, B, C�� �־��� �� AxBxC�� ����� �����
// 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷�
// �Է� => 	A = 150
//		  	B = 266
//		  	C = 427
// ��� =>	A x B x C = 17037300
//		  	0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
public class Ex02_numCount {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("A = ");
		int a = sc.nextInt();
		System.out.print("B = ");
		int b = sc.nextInt();
		System.out.print("C = ");
		int c = sc.nextInt();

		String result = (a * b * c) + "";
		int length = result.length();
		int[] cnt = new int[10];
		boolean flag = false;

		for (int i = 0; i < length; i++) {
			// charAt() : char���� �ƽ�Ű�ڵ� ������ ��ȯ�Ǳ� ������ ����
			// -> substring()�� ����Ͽ� int�� ����ȯ�Ͽ� ���
			cnt[Integer.parseInt(result.substring(i, i+1))]++;
		}

		// 150 266 427
		System.out.println("A x B x C = " + result);
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				// ó�� ����� �����ϰ� �տ� �޸� ���
				if(flag) {
					System.out.print(", ");
				}
				System.out.print(i + "�� " + cnt[i] + "��");
				flag = true;
			}
		} // end of for
		System.out.print(" ������.");
	}
}
