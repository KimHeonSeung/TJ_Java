
public class ControlStatement_WHILE_03 {

	public static void main(String[] args) {
		// while ���� ����Ͽ� ������ ���

		/*
		 * for (int i = 2 ; i <= 9 ; i++ ) { for ( int j = 1 ; j <= 9 ; j++ ) {
		 * System.out.printf("%d * %d = %d\n", i, j, i*j); } }
		 */

		int i = 2;
		int j = 1;

		while (i <= 9) {
			System.out.printf("%d���� �����մϴ�.\n", i);
			while (j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			j = 1;
			System.out.println();
			i++;
		}

		/*
		 * //System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : "); while ( kb.nextInt() != 100
		 * ) { System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : "); }
		 */
		System.out.println("������ ����");

	}

}
