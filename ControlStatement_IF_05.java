import java.util.Scanner;

public class ControlStatement_IF_05 {

	public static void main(String[] args) {
		// Ű���� �Է� ����� ����Ͽ� ����ڿ��� 3���� ���������� �Է¹�������.
		// �Էµ� ���� ������ ����Ͽ� ������ ����� ����ϼ���.
		// ����
		// 1��° 100, 200��° 100, 300��° 100
		// ó������ : ������ 300��, ����� 100.00�� �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		int score_1;
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		score_1 = sc.nextInt();
		
		int score_2;
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		score_2 = sc.nextInt();
		
		int score_3;
		System.out.print("����° ������ �Է��ϼ��� : ");
		score_3 = sc.nextInt();
		
		int sum = score_1 + score_2 + score_3;
		double avg = sum/3.0;
		System.out.println("������ "+sum+"�� �Դϴ�.");
		System.out.printf("������ %.2f�� �Դϴ�.", avg);		
		
		// Ű���� �Է� ó���� ����. ��Ʈ���� �������ִ� ���. ������ ������ �޸� ������ �Ͼ �� �ִ�.
		sc.close();

		/*
		 * // 1. �Է�
		 * // - ������ ����
		 * Scanner keyboard = new Scanner(System.in);
		 * int score_1, score_2, score_3;
		 * // - ������ ���� ����
		 * System.out.print("1��° ������ �Է��ϼ��� : ");
		 * score_1 = keyboard.nextInt();
		 * System.out.print("2��° ������ �Է��ϼ��� : ");
		 * score_2 = keyboard.nextInt();
		 * System.out.print("3��° ������ �Է��ϼ��� : ");
		 * score_3 = keyboard.nextInt();
		 * 
		 * // 2. ó��
		 * // - ������ ����
		 * int tot;
		 * double avg;
		 * // - ó�� ���� ���� �� ������ ���� ����
		 * tot = score_1 + score_2 + score_3
		 * avg = tot/3.0
		 * 
		 * // 3. ��� �� ����
		 * // - �Էµ� ���� �� ó���� ������ ���� ����Ͽ� ��� �� ����
		 * System.out.printf("ó������ : ������ %d��, ����� %.2f�� �Դϴ�.\n", tot, avg);
		 */
		
		
		
	}

}
