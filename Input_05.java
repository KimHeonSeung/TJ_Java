import java.util.Scanner;

public class Input_05 {

	public static void main(String[] args) {

		// 2���� ������ �Է¹޾� ������ ����� ���
		// ������ �ݵ�� 0~100 ������ ���� �ԷµǾ��
		Scanner kb = new Scanner(System.in);

		int score1, score2;

		do {
			System.out.print("ù��° ������ �Է��ϼ���. : ");
			score1 = kb.nextInt();
		} while (score1 < 0 || score1 > 100);

		while (true) {
			System.out.print("�ι�° ������ �Է��ϼ���. : ");
			score2 = kb.nextInt();
			if (score2 >= 0 && score2 <= 100) {
				break;
			}
		}

		int sum = score1 + score2;
		double avg = (double) sum / 2;

		System.out.printf("������ %d��, ����� %.2f��", sum, avg);

	}

}
