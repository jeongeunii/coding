package part08_recursion;

import java.util.Scanner;

// ���丮�� (���� 10872��)
// 1) 0���� ũ�ų� ���� ���� N �Է�
// 2) N! ���
public class Ex01_factorial {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� �Է� -> ");
		int n = sc.nextInt(); // ����

		System.out.println(fact(n));
	} // main method

	public static int fact(int n) {
		int result = 0;

		if (n == 1) {
			result = 1;
		} else {
			// ���ȣ��
			result = n * fact(n - 1);
		}
		
		return result;
	} // fact method
}
