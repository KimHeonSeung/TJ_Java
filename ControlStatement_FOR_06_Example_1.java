import java.util.*;

public class ControlStatement_FOR_06_Example_1 {

	public static void main(String[] args) {
		// ����ó���� ���� ���α׷��� �ۼ��Ѵ�.
		// 3 ������ ������ �Է¹޾� ����, ����� ����Ͽ� ���
		// ����ڰ� ���Ḧ ���� �� ���� �ݺ�
		// <����>
		// ����ó���� �����մϴ�.
		// 1��° ������ �Է��ϼ��� : 100
		// 2��° ������ �Է��ϼ��� : 100
		// 3��° ������ �Է��ϼ��� : 100
		// ���� : 300��, ��� : 100.00��
		// ����? (y/n) : n
		// 1��° ������ �Է��ϼ��� : 90
		// 2��° ������ �Է��ϼ��� : 90
		// 3��° ������ �Է��ϼ��� : 90
		// ���� : 270��, ��� : 90.00��
		// ����? (y/n) : n
		// ���α׷� ����
		Scanner kb = new Scanner(System.in);
		/*
		 * System.out.print("���� ó���� �����մϴ�.\n"); char e; int sum = 0; for ( int k = 1 ;
		 * ;k++ ) { if (k == 4) { System.out.printf("���� : %d, ��� : %.2f", sum, sum/3.0);
		 * break; } System.out.printf("%d��° ������ �Է��ϼ���. : \n",k); int x = kb.nextInt();
		 * sum += x; } System.out.print("����? (y/n) : "); e = kb.
		 */

		System.out.println("����ó���� �����մϴ�.");

		for (;;) {
			// 1. �Է�
			int s1, s2, s3;
			System.out.print("1��° ������ �Է��ϼ���. : ");
			s1 = kb.nextInt();
			System.out.print("2��° ������ �Է��ϼ���. : ");
			s2 = kb.nextInt();
			System.out.print("3��° ������ �Է��ϼ���. : ");
			s3 = kb.nextInt();

			int tot;
			double avg;

			tot = s1 + s2 + s3;
			avg = (double) tot / 3;

			System.out.printf("���� : %d��, ��� : %.2f�� \n", tot, avg);

			// �ݺ��� ����ó��
			System.out.print("���� ? (y/n) : ");
			char isExit = kb.next().charAt(0); // charAt(0)�� ���� �տ��ִ� ���ڸ� ������

			if (isExit == 'y' || isExit == 'Y')
				break;
		}

		System.out.println("���α׷� ����");
		kb.close();

	}

}
