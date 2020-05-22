package part08_recursion;

import java.util.Scanner;

// �Ǻ���ġ �� (���� 10870��)
// �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0�� ° �Ǻ���ġ ���� 0�̰�, 1�� ° �Ǻ���ġ ���� 1�̴�.
// 2�� ° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
// 1) 20���� �۰ų� ���� �ڿ��� n �Է�
// 2) n�� ° �Ǻ���ġ �� ���
public class Ex02_fibonacci {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("20���� �۰ų� ���� �ڿ��� �Է�");
		System.out.print("-> ");
		int n = sc.nextInt(); // �ڿ���

		System.out.println(fibo(n));
	} // main method

	public static int fibo(int n) {
		int result = 0;

		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			// ���ȣ��
			result = fibo(n - 1) + fibo(n - 2);
		}
		
		return result;
	} // fibo method
}
