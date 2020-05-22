package part13_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 큐 (백준 18258번)
// 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성한다.
// <명령은 총 6가지>
// - push : 정수를 큐에 넣는 연산
// - pop : 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력 (큐에 정수가 없을 경우 -1 출력)
// - size : 큐에 들어있는 정수의 개수 출력
// - empty : 큐가 비어있으면 1, 아니면 0 출력
// - front : 큐의 가장 앞에 있는 정수 출력 (큐에 정수가 없을 경우 -1 출력)
// - back : 큐의 가장 뒤에 있는 정수 출력 (큐에 정수가 없을 경우 -1 출력)
// 1) 명령의 수 N 입력
// 2) N개의 줄에 명령 하나씩 입력
// 3) 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력
public class Ex01_queue {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// 큐 생성
		Queue<Integer> queue = new LinkedList<>();

		System.out.print("명령의 수 입력 -> ");
		int cnt = sc.nextInt(); // 명령의 수
		int num = 0; // 큐에 넣을 정수

		for (int i = 0; i < cnt; i++) {
			String str = sc.next(); // 명령
			if (str.contains("push")) { // push : 정수를 큐에 넣는 연산
				num = sc.nextInt();
				queue.add(num);
			} else if (str.equals("pop")) { // pop : 큐의 가장 앞의 정수를 빼고 출력 (없으면 -1 출력)
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			} else if (str.equals("size")) { // size : 큐의 정수 개수 출력
				System.out.println(queue.size());
			} else if (str.equals("empty")) { // empty : 큐가 비어있으면 1, 아니면 0 출력
				System.out.println(queue.isEmpty() ? 1 : 0);
			} else if (str.equals("front")) { // front : 큐의 가장 앞의 정수 출력 (없으면 -1 출력)
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
			} else if (str.equals("back")) { // back : 큐의 가장 뒤의 정수 출력 (없으면 -1 출력)
				System.out.println(queue.isEmpty() ? -1 : num);
			} // end of if
		} // end of for
	}
}
