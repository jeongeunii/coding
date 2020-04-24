package part05_function;

// 셀프 넘버 (백준 4673번)
// 양의 정수 n에 대해서 d(n)은 n과 n의 각 자리수를 더하는 함수이다.
// n은 d(n)의 생성자이다.
// 생성자가 없는 숫자를 셀프 넘버라고 한다.
// 100보다 작거나 같은 셀프 넘버 출력
public class Ex01_selfNumber {

	public static void main(String[] args) {

		int[] arr = new int[100];

		for (int i = 1; i <= arr.length; i++) {
			int num = d(i);
			// d(i)값이 100보다 작거나 같은 경우 배열 값에 -1 저장
			if (num <= 100) {
				arr[num - 1] = -1;
			}
		} // end of for

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				System.out.print((i + 1) + " ");
			}
		} // end of for

	} // main method

	// 양의 정수 n에 대해서 n과 n의 각 자리수를 더하는 함수
	public static int d(int n) {
		int result = n;
		String str = Integer.toString(n);

		for (int i = 0; i < str.length(); i++) {
			result += Integer.parseInt(str.substring(i, i + 1));
		}

		return result;
	} // d(n) method
}
