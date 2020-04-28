package part06_string;

import java.util.Scanner;

// �׷� �ܾ� (���� 1316��)
// �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츦 ���Ѵ�.
// ���� ���, ccazzzbb�� kin�� �� ���ڰ� �����ؼ� ��Ÿ���� ������ �׷� �ܾ��̴�.
// aabbbccb�� b�� ���ӵ��� �ʰ� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
// 1) �ܾ��� ���� N �Է� (N�� 100���� �۰ų� ���� �ڿ���)
// 2) N���� �ܾ� �Է� (���ĺ� �ҹ��ڷθ�)
// 3) �׷� �ܾ��� ���� ���
public class Ex09_groupWord {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("�ܾ��� ���� �Է� -> ");
		int n = sc.nextInt(); // �ܾ��� ����
		System.out.print(n + "���� �ܾ� �Է� -> ");
		String[] arr = new String[n]; // �ܾ� �迭
		int index = 0; // ���ĺ� ù ���� �ε���
		int lastIndex = 0; // ���ĺ� ������ ���� �ε���
		int cnt = 0; // �׷� �ܾ��� ����

		a: for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			for (int j = 0; j < arr[i].length(); j++) {
				index = arr[i].indexOf(arr[i].charAt(j));
				lastIndex = arr[i].lastIndexOf(arr[i].charAt(j));
				// ���ĺ� ù ���� �ε������� ������ ���� �ε������� ���ĺ� �˻� ����
				for (int k = index; k <= lastIndex; k++) {
					// �ٸ� ���ĺ��� �ִ� ���
					if (arr[i].charAt(index) != arr[i].charAt(k)) {
						continue a; // a:for ���� �ܾ�� ���� �ѱ�
					}
				}
				// for���� �������� ++�� �Ǳ� ������
				// j�� lastIndex�� �����ϸ� ���� ���� �� j�� (lastIndex + 1)
				j = lastIndex;
			} // end of for
			cnt++; // �׷� �ܾ��� ���� ����
		} // end of a:for
		
		System.out.println(cnt);
	}
}
