import java.util.*;

public class ControlStatement_FOR_06_Example_2 {

	public static void main(String[] args) {
		// ����ڿ��� ���� �Ѱ��� �Է¹޴´�.
		// - ������ 1000 �̻��� ���� �Է¹޾ƾ�.
		// - 1000 �̸��� ���� �Է��ϸ� �ٽ� �Է¹޾ƾ�.

		Scanner kb = new Scanner(System.in);
		int num;

		for (;;) {
			System.out.print("1000 �̻��� ������ �Է��ϼ���. : ");
			num = kb.nextInt();
			if (num >= 1000)
				break;
		}

		// 1000 �̻��� ���� �ùٸ��� �Էµ� ���
		// 1���� �Էµ� �������� 3�� ������� �հ踦 ���.
		// �հ迡 ���� 3�� ����� ����?

		int tot = 0, count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				// �հ�
				tot += i;
				// ī����
				count++;
			}
		}
		System.out.printf("1 ~ %d������ 3�� ������� �հ�� %d,\n", num, tot);
		System.out.printf("1 ~ %d������ 3�� ������� ������ %d,\n", num, count);
	}

}
