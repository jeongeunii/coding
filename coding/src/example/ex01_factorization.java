package example;

import java.util.Scanner;

// ���μ� ����
// 1) ���ڸ� �Է� �޴´�.
// 2) ��� ���� �Է� ���� ���� = x * y ��������  ex) 24 = 2 * 2 * 2 * 3
// 3) 0�� �Է� �Ǹ� ���α׷��� out �ǵ���
// 4) ��� ���� ���´ٸ� �ٽ� �� ���� �ݺ�
public class ex01_factorization {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� -> ");
			int cnt = sc.nextInt();
			int i = 2;
			String result = cnt + " = ";

			if (cnt == 0) {
				System.out.println("�ý��� ����");
				System.exit(0);
			} // end of if

			while (cnt != 1) {
				if (cnt % i == 0) {
					cnt /= i;
					result += i;
				} else {
					i++;
					// cnt % i != 0 �̶�� �Ʒ��� �ڵ带 ���������ʰ� ���� ����� �ѱ�
					continue;
				}
				
				// cnt = 1 �� �Ǿ� ���μ������� ������ �� �ڿ��� * ��� ����
				if(cnt != 1) {
					result += " * ";
				}
			} // end of while(cnt != 1)

			System.out.println("���μ����� ��� : " + result + "\n");
		} // end of while(true)
	}
}
