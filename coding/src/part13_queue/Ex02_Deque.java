package part13_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// �� (���� 10866��)
// ������ �����ϴ� ���� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ѵ�.
// <����� �� 8����>
// - push_front : ������ ���� �տ� �ִ� ����
// - push_back : ������ ���� �ڿ� �ִ� ����
// - pop_front : ���� ���� �տ� �ִ� ������ ����, �� ���� ��� (���� ������ ���� ��� -1 ���)
// - pop_back : ���� ���� �ڿ� �ִ� ������ ����, �� ���� ��� (���� ������ ���� ��� -1 ���)
// - size : ���� ����ִ� ������ ���� ���
// - empty : ���� ��������� 1, �ƴϸ� 0 ���
// - front : ���� ���� �տ� �ִ� ���� ��� (���� ������ ���� ��� -1 ���)
// - back : ���� ���� �ڿ� �ִ� ���� ��� (���� ������ ���� ��� -1 ���)
// 1) ����� �� N �Է�
// 2) N���� �ٿ� ��� �ϳ��� �Է�
// 3) ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ���
public class Ex02_Deque {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// �� ����
		Deque<Integer> deque = new LinkedList<>();

		System.out.print("����� �� �Է� -> ");
		int cnt = sc.nextInt(); // ����� ��
		int num = 0; // ���� ���� ����

		for (int i = 0; i < cnt; i++) {
			String str = sc.next(); // ���
			if (str.contains("push_front")) { // push_front : ������ ���� �տ� �ִ� ����
				num = sc.nextInt();
				deque.addFirst(num);
			} else if (str.contains("push_back")) { // push_back : ������ ���� �ڿ� �ִ� ����
				num = sc.nextInt();
				deque.addLast(num);
			} else if (str.equals("pop_front")) { // pop_front : ���� ���� ���� ������ ���� ��� (������ -1 ���)
				System.out.println(deque.isEmpty() ? -1 : deque.pop());
			} else if (str.equals("pop_back")) { // pop_back : ���� ���� ���� ������ ���� ��� (������ -1 ���)
				System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
			} else if (str.equals("size")) { // size : ���� ���� ���� ���
				System.out.println(deque.size());
			} else if (str.equals("empty")) { // empty : ���� ��������� 1, �ƴϸ� 0 ���
				System.out.println(deque.isEmpty() ? 1 : 0);
			} else if (str.equals("front")) { // front : ���� ���� ���� ���� ��� (������ -1 ���)
				System.out.println(deque.isEmpty() ? -1 : deque.peek());
			} else if (str.equals("back")) { // back : ť�� ���� ���� ���� ��� (������ -1 ���)
				System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
			} // end of if
		} // end of for
	}
}
