import java.util.*;

public class ControlStatement_FOR_06 {

	public static void main(String[] args) {
		// ����ڰ� 100�� �Է��� �� ���� ��� �Է��� �ޱ�
		// 100�� �ԷµǸ� ���α׷� ����

		// 1. �Է�
		Scanner kb = new Scanner(System.in);

		// 2. ó��
		/*
		 * for( int in = 0 ; in != 100 ; ) { System.out.print("������ �Է��ϼ��� : "); in =
		 * kb.nextInt(); }
		 */

		// �Ʒ��� ���� for ���� ���ǽ� ������ �ۼ����� �ʴ� ��� �������� �ʴ� �溹���� ���� �� �ִ�. (���ѷ���)
		for (int in;;) {
			System.out.print("������ �Է��ϼ��� : ");
			if ((in = kb.nextInt()) == 100) {
				// Ű���忡�� �Էµ� ������ 100�� ���� ��� break�� �����Ͽ� �ݺ����� ��������
				break;
			}
		}
		// 3. ��� �� ����
		System.out.println("���α׷� ����");

	}
}
