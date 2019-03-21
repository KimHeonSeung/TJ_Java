import java.util.*;

public class Day04_Exercise {

	public static void main(String[] args) {
		// 4��

		// 1��
		// ���ǹ��� if, switch���� �ִ�.
		// �ݺ����� for, while, do ~ while ���� �ִ�.

		// 2��
		// switch���� ����Ÿ�� ������ �������� �����ϴ� ����ĸ� �� �� �־ double�� �� �� ����.

		// 3��
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.printf("�� ���� %d�̴�.\n", sum);

		// 4��
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		System.out.printf("(%d,%d)\n\n", num1, num2); // (��1,��2) ���·� ���

		int num3 = (int) (Math.random() * 6) + 1;
		int num4 = (int) (Math.random() * 6) + 1;
		while (num1 + num2 != 5) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d,%d)\n", num1, num2); // �� ���� ���� 5�� ���� �� ������ ���
		}

		// 5��
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60)
					System.out.printf("�ش� (%d,%d)�̴�.\n", x, y);
			}
		}

		// 6��
		for (int i = 1; i <= 5; i++) {
			if (i == 1)
				System.out.println("*");
			else if (i == 2)
				System.out.println("**");
			else if (i == 3)
				System.out.println("***");
			else if (i == 4)
				System.out.println("****");
			else
				System.out.println("*****");
		}

		// 7��
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ���� |");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			int a = sc.nextInt();
			
			if (a == 1) {
				System.out.print("���ݾ� : ");
				balance += sc.nextInt();
				System.out.printf("���ݾ��� %d�� �Դϴ�.\n", balance);
			}
			else if (a == 2) {
				System.out.print("��ݾ� : ");
				int out = sc.nextInt();
				balance = balance - out;
				System.out.printf("�ܰ�� %d�� �Դϴ�.\n", balance);
			}
			else if (a == 3) {
				System.out.printf("�ܰ� : %d\n", balance);
			}
			else if (a == 4) {
				break;
			}
		}
		System.out.println("���α׷� ����");

	}

}
