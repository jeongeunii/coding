package part01_if;

import java.util.Scanner;

// ���� (2753��)
// �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷�
// ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� ��
// �Ǵ� 400�� ����� �� �̴�.
// ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
// �Է� => 1900	�Է� => 2000
// ��� => 0		��� => 1
public class Ex01_leapYear {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int year = 0;
		int result = 0;

		while (true) {
			System.out.print("������ �Է��ϼ��� -> ");
			year = sc.nextInt();

			if (year < 1 || year > 4000) {
				System.out.println("������ �ٽ� �Է��ϼ���!");
			} else {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					result = 1;
				}
				break;
			} // end of if
			
		} // end of while
		
		System.out.println(result);
	}
}
