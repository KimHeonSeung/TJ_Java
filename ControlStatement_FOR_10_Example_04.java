
public class ControlStatement_FOR_10_Example_04 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ����� ����
		// ������ ���

		// �ܺ��� �ݺ���
		// �ܼ��� �����ϴ� �ݺ��� ( 2 ~ 9���� �ݺ� )

		// ������ ���� ������ �پ ���. 2�� 3�� ... 9��
		// j�� ��,

		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 0) {
					// ������ ��� ���
					System.out.printf("%-25s\t", j + " ��");
				} else {
					System.out.printf("%d * %d = %2d\t", j, i, j * i);
				}
			}
			System.out.println();
		}

		/*
		 * 
		 * for (int i = 2; i <= 9; i++) { System.out.printf("%d ���� ����մϴ�.\n", i); // ������
		 * �ݺ��� // �ܼ��� �������� ���� �����ϴ� �ݺ��� ( 1 ~ 9���� �ݺ� ) for (int j = 1; j <= 9; j++) {
		 * 
		 * /* if ( (i%2==0 && j%2==0) || (i%2==1 && j%2==1) ) {
		 * System.out.printf("%d * %d = %d\n",i ,j, i*j); }
		 * 
		 * // boolean flag_even = i % 2 == 0 && j % 2 == 0; // boolean flag_odd = i % 2
		 * == 1 && j % 2 == 1; // if (flag_even || flag_odd) //
		 * System.out.printf("%d * %d = %d\n", i, j, i * j);
		 * 
		 * 
		 * if (i % 2 == j % 2) System.out.printf("%d * %d = %d\n", i, j, i * j);
		 * 
		 * } System.out.println(); }
		 */

	}
}
