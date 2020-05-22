package part13_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// ť (���� 18258��)
// ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ѵ�.
// <����� �� 6����>
// - push : ������ ť�� �ִ� ����
// - pop : ť���� ���� �տ� �ִ� ������ ����, �� ���� ��� (ť�� ������ ���� ��� -1 ���)
// - size : ť�� ����ִ� ������ ���� ���
// - empty : ť�� ��������� 1, �ƴϸ� 0 ���
// - front : ť�� ���� �տ� �ִ� ���� ��� (ť�� ������ ���� ��� -1 ���)
// - back : ť�� ���� �ڿ� �ִ� ���� ��� (ť�� ������ ���� ��� -1 ���)
// 1) ����� �� N �Է�
// 2) N���� �ٿ� ��� �ϳ��� �Է�
// 3) ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ���
public class Ex01_queue {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// ť ����
		Queue<Integer> queue = new LinkedList<>();

		System.out.print("����� �� �Է� -> ");
		int cnt = sc.nextInt(); // ����� ��
		int num = 0; // ť�� ���� ����

		for (int i = 0; i < cnt; i++) {
			String str = sc.next(); // ���
			if (str.contains("push")) { // push : ������ ť�� �ִ� ����
				num = sc.nextInt();
				queue.add(num);
			} else if (str.equals("pop")) { // pop : ť�� ���� ���� ������ ���� ��� (������ -1 ���)
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			} else if (str.equals("size")) { // size : ť�� ���� ���� ���
				System.out.println(queue.size());
			} else if (str.equals("empty")) { // empty : ť�� ��������� 1, �ƴϸ� 0 ���
				System.out.println(queue.isEmpty() ? 1 : 0);
			} else if (str.equals("front")) { // front : ť�� ���� ���� ���� ��� (������ -1 ���)
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
			} else if (str.equals("back")) { // back : ť�� ���� ���� ���� ��� (������ -1 ���)
				System.out.println(queue.isEmpty() ? -1 : num);
			} // end of if
		} // end of for
	}
}
