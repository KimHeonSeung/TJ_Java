
public class ControlStatement_FOR_13 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ��������� break, continue
		// break : IF ���� ������ ù��° ������ ���������� ���
		// continue : IF ���� ������ ù��° ������ ���� �������� �̵��ϴ� ���

		// ��ø�� �ݺ����� �����ϱ� ���� ��

		boolean flag = false;

		out: for (int i = 1; i <= 3; i++) {

			in: for (int j = 1; j <= 3; j++) {

				// out ������ ���������� ���
				// break out;
				// out ������ ������������ �̵�
				if (i == 2 && j == 2) {
					continue out;
				}
				System.out.printf("i -> %d, j -> %d\n", i, j);
			}
			System.out.println();
		} // countinue out; �� �� �߰�ȣ �������� �̵���. ���� �ٽ� i++ �� �� i <== 3 ���� Ȯ��

	}

}
