package part12_stack;

import java.util.Scanner;
import java.util.Stack;

// ���� (���� 10828��)
// ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ѵ�.
// <����� �� 5����>
// - push : ������ ���ÿ� �ִ� ����
// - pop : ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ��� (���ÿ� ������ ���� ��� -1 ���)
// - size : ���ÿ� ����ִ� ������ ���� ���
// - empty : ������ ��������� 1, �ƴϸ� 0 ���
// - top : ������ ���� ���� �ִ� ���� ��� (���ÿ� ������ ���� ��� -1 ���)
// 1) ����� �� N �Է�
// 2) N���� �ٿ� ��� �ϳ��� �Է�
// 3) ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ���
public class Ex01_stack {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// ���� ����
		Stack<Integer> stack = new Stack<>();

		System.out.print("����� �� �Է� -> ");
		int cnt = sc.nextInt(); // ����� ��

		for (int i = 0; i < cnt; i++) {
			String str = sc.next(); // ���
			if (str.contains("push")) { // push : ������ ���ÿ� �ִ� ����
				int num = sc.nextInt(); // ���ÿ� ���� ����
				stack.push(num);
			} else if (str.equals("pop")) { // pop : ������ ���� ���� ������ ���� ��� (������ -1 ���)
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				// System.out.println(stack.isEmpty() ? -1 : stack.pop());
			} else if (str.equals("size")) { // size : ������ ���� ���� ���
				System.out.println(stack.size());
			} else if (str.equals("empty")) { // empty : ������ ��������� 1, �ƴϸ� 0 ���
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				// System.out.println(stack.isEmpty() ? 1 : 0);
			} else if (str.equals("top")) { // top : ������ ���� ���� ���� ��� (������ -1 ���)
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				// System.out.println(stack.isEmpty() ? -1 : stack.peek());
			} // end of if
		} // end of for
	}
}
