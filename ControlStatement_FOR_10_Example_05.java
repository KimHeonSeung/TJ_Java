import java.util.*;

public class ControlStatement_FOR_10_Example_05 {

	public static void main(String[] args) {
		// ��ø�� �ݺ����� Ȱ���Ͽ� �л��� ������ ó���ϴ� ���α׷� �ۼ�
		// <����>
		// �л��� �Է� : 3
		// ����� �Է� : 3
		// 1��° �л��� 1��° ���� :
		// 1��° �л��� 2��° ���� :
		// 1��° �л��� 3��° ���� :
		// 1��° �л��� ������ 300��, ����� 100��
		// 2��° �л��� 1��° ���� :
		// 2��° �л��� 2��° ���� :
		// 2��° �л��� 3��° ���� :
		// 2��° �л��� ������
		// ...
		// �ٱ����� 1���Ҷ� ������ ��ü�� ����.

		Scanner kb = new Scanner(System.in);

		int a, b; // ���� ���� �ѹ��� �ٲٴ¹� : ��Ŭ�� -> refactor -> rename
		int sum;

		System.out.print("�л� �� �Է� : ");
		a = kb.nextInt();
		System.out.print("���� �� �Է� : ");
		b = kb.nextInt();
		System.out.println();

		for (int i = 1; i <= a; i++) {
			System.out.printf("<%d��° �л� ������  ó���մϴ�.>\n", i);
			// ó�� ���� �� ���ο� �Է� ������ �߻�!
			sum = 0;
			for (int j = 1; j <= b; j++) {
				System.out.printf("%d��° �л��� %d��° ���� : ", i, j);
				sum += kb.nextInt();
			}
			double avg = (double) sum / b;
			System.out.printf("%d��° �л��� ���� : %d��, ��� : %.2f��\n\n", i, sum, avg);
		}
		System.out.println("���α׷� ����");
		kb.close();
	}
}
