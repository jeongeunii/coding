package part06_string;

import java.util.Scanner;

// �ƽ�Ű�ڵ� (���� 11654��)
// ���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ� �� ���
public class Ex01_ASCIIcode {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("���� �Է� -> ");
		String ch = sc.next();
		System.out.println((int) ch.charAt(0));

	}
}
