import java.util.*;

public class Array_13 {

	public static void main(String[] args) {
		// ����ڿ��� �迭�� ũ�⸦ �Է¹޾� �迭�� �����ϰ�
		// �� ��ҿ� ���� �Է¹޾� �Էµ� ������ ������� ���� ���

		// ����� ����� �� ����ڿ��� ���� ����� �Է¹ޱ� ( �������� : 1, �������� : 2 )
		// ����ڰ� ������ ���� ������� �迭�� ������ �� ���
		
		Scanner kb = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���. : ");
		int[] numbers = new int[kb.nextInt()];
		
		for ( int i = 0 ; i < numbers.length ; i ++ ) {
			System.out.printf("%d ��° ������ �Է� : ", i+1);
			numbers[i] = kb.nextInt();
		}
		// �Է��� ����� ��, ���
		for ( int i = 0 ; i < numbers.length ; i ++ ) {
			System.out.printf("%d  ", numbers[i]);	
		}
		System.out.println();
		System.out.println("���� ����� �����ϼ���.");
		System.out.print("(�������� : 1, �������� : 2) : ");
		int sorting_method = kb.nextInt();
		
		
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				// �������� ���� ����
				boolean flag_asc = sorting_method == 1 && numbers[i] > numbers[j];
				// �������� ���� ����
				boolean flag_desc = sorting_method == 2 && numbers[i] < numbers[j];
				if (flag_asc || flag_desc) {
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
		// ������ ����� �� ���
		System.out.println();
		for (int k = 0; k < numbers.length; k++) {
			System.out.printf("%d ", numbers[k]);
		}
		
		
		
		
		
		/* < ���� �ϼ��� �ڵ� >

		Scanner kb = new Scanner(System.in);
		int array_size;
		int[] numbers;

		System.out.print("�迭�� ũ�⸦ �Է��ϼ���. : ");
		array_size = kb.nextInt();

		numbers = new int[array_size];

		for (int i = 0; i < array_size; i++) {
			System.out.printf("%d��° ������ �Է��ϼ���. : ", i + 1);
			numbers[i] = kb.nextInt();
		}

		System.out.print("\n�������� ������ 1, �������� ������ 2�� �Է��ϼ���. : ");
		int key = kb.nextInt();

		if (key == 1) {
			for (int a = 0; a < numbers.length - 1; a++) {
				for (int b = a + 1; b < numbers.length; b++) {
					int temp;
					if (numbers[a] > numbers[b]) {
						temp = numbers[b];
						numbers[a] = numbers[b];
						numbers[b] = temp;
					}
				}
			}
			System.out.println();
			for (int k = 0; k < numbers.length; k++) {

				System.out.printf("%d ", numbers[k]);
			}
		} else if (key == 2) {
			for (int a = 0; a < numbers.length - 1; a++) {
				for (int b = a + 1; b < numbers.length; b++) {
					int temp;
					if (numbers[a] < numbers[b]) {
						temp = numbers[a];
						numbers[a] = numbers[b];
						numbers[b] = temp;
					}
				}
			}
			System.out.println();
			for (int k = 0; k < numbers.length; k++) {
				System.out.printf("%d ", numbers[k]);
			}
		}
		*/
	}

}
