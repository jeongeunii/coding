package part02_for;

import java.util.Scanner;

// A+B�� ���� �� ��� (11022��)
// 1) ���̽��� ���� T �Է�
// 2) T��ŭ �� ���� �Է� (0<A,B<10)
// 3) �� ������ �� ���
public class Ex01_sum {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		int[] a = null;
		int[] b = null;

		while (true) {
			System.out.print("���̽� ���� �Է� -> ");
			num = sc.nextInt();
			a = new int[num];
			b = new int[num];

			if (num != 0) {
				break;
			}
			
			System.out.println("���̽� ������ �ٽ� �Է��ϼ���!");
		} // end of while
		
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			
			if (a[i] <= 0 || a[i] >= 10 || b[i] <= 0 || b[i] >= 10) {
				System.out.println("�� ������ �ٽ� �Է��ϼ���!");
				i--;
			} // end of if
			
		} // end of for
		
		for (int i = 0; i < num; i++) {
			System.out.println("Case #" + (i + 1) + ": " + (a[i] + b[i]));
		}
	}
}
