import java.util.*;

public class ControlStatement_DO_WHILE_03 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		do {
			System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : ");
		} while (kb.nextInt() != 100);
		System.out.println("���α׷� ����");

		// �Ʒ� �ڵ带 ����ó�� do ~ while�� �ٲ㼭 ��� ����
		/*
		 * System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : "); while ( kb.nextInt() != 100 )
		 * { System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : "); }
		 * System.out.println("���α׷� ����");
		 */
	}
}