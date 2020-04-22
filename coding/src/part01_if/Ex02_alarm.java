package part01_if;

import java.util.Scanner;

// �˶� �ð� (���� 2884��)
// 45�� ���� �˶� ���߱�
// �� ����  H�� M�� �־�����. (0<=H<=23, 0<=M<=59)
// �Ϸ��� ������ 0:0�̰�, ���� 23:59�̴�.
// �Է� => 10 10
// ��� => 9 25
public class Ex02_alarm {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int hour = 0;
		int min = 0;

		while (true) {
			System.out.print("�ð��� ���� �Է��ϼ��� -> ");
			hour = sc.nextInt();
			min = sc.nextInt();

			if (hour >= 0 && hour <= 23 && min >= 0 && min <= 59) {
				if (min >= 45) {
					min -= 45;
				} else {
					if (hour == 0) {
						hour = 23;
					} else {
						hour--;
					}
					min += 15; // min = min + 60 - 45;
				}
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���!");
			} // end of if
			
		} // end of while
		
		System.out.println(hour + "�� " + min + "��");
	}

}
