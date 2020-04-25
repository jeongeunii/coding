package part06_string;

import java.util.Arrays;
import java.util.Scanner;

// ���ĺ� ã�� (���� 10809��)
// 1) ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S �Է�
// 2) ������ ���ĺ��� ���ؼ� �ܾ ���ԵǾ� �ִ� ��� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ���
public class Ex02_alphabet {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str = ""; // �ҹ��ڷ� �̷���� �ܾ�
		int[] arr = new int[26]; // ���ĺ� ���� ��ġ �迭

		for (int i = 0; i < arr.length; i++) {
			// �⺻�� -1 ����
			arr[i] = -1;
		}

		System.out.print("�ܾ� S �Է� -> ");
		str = sc.next();

		// arr �迭�� �� ���ĺ��� ó�� ���� ��ġ ����
		for (int i = 0; i < str.length(); i++) {
			// a�� �ƽ�Ű�ڵ� �� : 97  -> arr�� 0����
			// z�� �ƽ�Ű�ڵ� �� : 122 -> arr�� 25����
			arr[(int) str.charAt(i) - 97] = str.indexOf(str.charAt(i));
		}

		System.out.println(Arrays.toString(arr));
	}
}
