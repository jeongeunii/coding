package example;

import java.util.Scanner;

// ���ڿ� ��Ī
// 1) ���ڿ��� �Է¹ް�
// 2) ���ڿ��� ��Ī�̸� true, ��Ī�� �ƴϸ� false ���
public class ex03_symmetry {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.print("���ڿ��� �Է��ϼ��� -> ");
			String str = sc.nextLine();
			int cnt = str.length();
			int end = cnt - 1;
			boolean result = true;

			if (str.equals("exit")) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}

			// ���ڿ�����/2 ��ŭ �ݺ��Ͽ� i�� end�� ° �ڸ� ���� ��
			for (int i = 0; i < cnt / 2; i++, end--) {
				if (str.charAt(i) != str.charAt(end)) {
					result = false;
					break;
				}
			}

			System.out.println(result);
			
		} // end of while
	}
}
