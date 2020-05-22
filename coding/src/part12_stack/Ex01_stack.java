package part12_stack;

import java.util.Scanner;
import java.util.Stack;

// 스택 (백준 10828번)
// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성한다.
// <명령은 총 5가지>
// - push : 정수를 스택에 넣는 연산
// - pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력 (스택에 정수가 없을 경우 -1 출력)
// - size : 스택에 들어있는 정수의 개수 출력
// - empty : 스택이 비어있으면 1, 아니면 0 출력
// - top : 스택의 가장 위에 있는 정수 출력 (스택에 정수가 없을 경우 -1 출력)
// 1) 명령의 수 N 입력
// 2) N개의 줄에 명령 하나씩 입력
// 3) 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력
public class Ex01_stack {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// 스택 생성
		Stack<Integer> stack = new Stack<>();

		System.out.print("명령의 수 입력 -> ");
		int cnt = sc.nextInt(); // 명령의 수

		for (int i = 0; i < cnt; i++) {
			String str = sc.next(); // 명령
			if (str.contains("push")) { // push : 정수를 스택에 넣는 연산
				int num = sc.nextInt(); // 스택에 넣을 정수
				stack.push(num);
			} else if (str.equals("pop")) { // pop : 스택의 가장 위의 정수를 빼고 출력 (없으면 -1 출력)
				if (stack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				// System.out.println(stack.isEmpty() ? -1 : stack.pop());
			} else if (str.equals("size")) { // size : 스택의 정수 개수 출력
				System.out.println(stack.size());
			} else if (str.equals("empty")) { // empty : 스택이 비어있으면 1, 아니면 0 출력
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				// System.out.println(stack.isEmpty() ? 1 : 0);
			} else if (str.equals("top")) { // top : 스택의 가장 위의 정수 출력 (없으면 -1 출력)
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
