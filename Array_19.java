
public class Array_19 {

	public static void main(String[] args) {
		// ������ �迭�� ������ ������ ��ġ�ϴ� length ������ ����
		// (2���� �迭�� 2��, 3���� �迭�� 3��)

		int[][] arr = new int[7][12];

		// 2���� �迭�� �̸��� ����Ͽ� length�� �����ϴ� ���
		// 1���� �迭�� ������ ��ȯ�ȴ�.
		System.out.printf("arr.length -> %d\n", arr.length);

		// 2���� �迭�� �� ��ҿ� ���ؼ� �ε��� �������� ������ �� length�Ӽ��� ����ϸ� �� 1���� �迭�� ũ�Ⱑ ��ȯ�ȴ�.
		System.out.printf("arr[0].length -> %d\n", arr.length);

		// ���� ����� ������ �迭 arr�� length �Ӽ��� ����Ͽ� ���� ����ϼ���.

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j + 10;
				System.out.printf("(%d,%d)�� ���� ���� %d�̴�.\n", i + 1, j + 1, arr[i][j]);
			}
			System.out.println();
		}

	}

}
