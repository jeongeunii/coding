package part13_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// 덱 (백준 10866번)
// 정수를 저장하는 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성한다.
// <명령은 총 8가지>
// - push_front : 정수를 덱의 앞에 넣는 연산
// - push_back : 정수를 덱의 뒤에 넣는 연산
// - pop_front : 덱의 가장 앞에 있는 정수를 빼고, 그 수를 출력 (덱에 정수가 없을 경우 -1 출력)
// - pop_back : 덱의 가장 뒤에 있는 정수를 빼고, 그 수를 출력 (덱에 정수가 없을 경우 -1 출력)
// - size : 덱에 들어있는 정수의 개수 출력
// - empty : 덱이 비어있으면 1, 아니면 0 출력
// - front : 덱의 가장 앞에 있는 정수 출력 (덱에 정수가 없을 경우 -1 출력)
// - back : 덱의 가장 뒤에 있는 정수 출력 (덱에 정수가 없을 경우 -1 출력)
// 1) 명령의 수 N 입력
// 2) N개의 줄에 명령 하나씩 입력
// 3) 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력
public class Ex02_Deque {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// 덱 생성
		Deque<Integer> deque = new LinkedList<>();

		System.out.print("명령의 수 입력 -> ");
		int cnt = sc.nextInt(); // 명령의 수
		int num = 0; // 덱에 넣을 정수

		for (int i = 0; i < cnt; i++) {
			String str = sc.next(); // 명령
			if (str.contains("push_front")) { // push_front : 정수를 덱의 앞에 넣는 연산
				num = sc.nextInt();
				deque.addFirst(num);
			} else if (str.contains("push_back")) { // push_back : 정수를 덱의 뒤에 넣는 연산
				num = sc.nextInt();
				deque.addLast(num);
			} else if (str.equals("pop_front")) { // pop_front : 덱의 가장 앞의 정수를 빼고 출력 (없으면 -1 출력)
				System.out.println(deque.isEmpty() ? -1 : deque.pop());
			} else if (str.equals("pop_back")) { // pop_back : 덱의 가장 뒤의 정수를 빼고 출력 (없으면 -1 출력)
				System.out.println(deque.isEmpty() ? -1 : deque.removeLast());
			} else if (str.equals("size")) { // size : 덱의 정수 개수 출력
				System.out.println(deque.size());
			} else if (str.equals("empty")) { // empty : 덱이 비어있으면 1, 아니면 0 출력
				System.out.println(deque.isEmpty() ? 1 : 0);
			} else if (str.equals("front")) { // front : 덱의 가장 앞의 정수 출력 (없으면 -1 출력)
				System.out.println(deque.isEmpty() ? -1 : deque.peek());
			} else if (str.equals("back")) { // back : 큐의 가장 뒤의 정수 출력 (없으면 -1 출력)
				System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
			} // end of if
		} // end of for
	}
}
