
public class ControlStatement_FOR_10_Example_01 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ����� ����
		// ������ ���

		// �ܺ��� �ݺ���
		// �ܼ��� �����ϴ� �ݺ��� ( 2 ~ 9���� �ݺ� )

		// ���� ���� ���
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d ���� ����մϴ�.\n", i);

			// ������ �ݺ���
			// �ܼ��� �������� ���� �����ϴ� �ݺ��� ( 1 ~ 9���� �ݺ� )
			for (int j = 1; j <= 9; j++) {

				System.out.printf("%d * %d = %d\n", i, j, i * j);
				// if ( j == 9) {
				// System.out.println();
			}
			System.out.println();
		}
	}
}
