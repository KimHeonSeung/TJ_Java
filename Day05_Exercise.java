import java.util.*;
public class Day05_Exercise {

	public static void main(String[] args) {
		// 5��
		
		// 1�� 
		// ����Ÿ�� ������ �޸� ���� ��ġ�� ������ �ƴ� �� �����̴�.
		
		// 2��
		// �ڹٿ��� �������� �ʴ� ��ü�� ���� �Ҹ��ڵ带 �ۼ����� �ʾƵ� JVM���� �ڵ����� �����Ѵ�.
		
		// 3��
		// ������ ���ͷ��̾ new�� ������ String�� String���� ������ ���ͷ��� �ٸ� ��ü�� �����Ѵ�.
		
		// 4��
		// �迭�� �̹� ���� �� �� �ٸ� ���๮���� �߰�ȣ�� ����� �迭 ������ �Ұ����ϴ�.
		// �迭 ������ �̸� ������ �� ���� ���߿� �����ϴ� ��Ȳ�̶�� 
		// ���� = new int[] {��0,��1,...,��N} �� ���� new�� �߰�ȣ�� ����Ѵ�.
		
		// 5��
		// boolean Ÿ���� �迭�� �ʱⰪ�� true�� �ƴ� false�̴�.
		
		
		
		// 6��
		int[][] array_06 = { {95,86}, {83,92,96}, {78,83,93,87,88} };
		// �� ��, array_06.length�� 3�̰�, array[2].length�� 5�̴�.
		System.out.println(array_06.length);
		System.out.println(array_06[2].length);
		
		
		
		// 7��
		int max_07 = 0;
		int[] array_07 = { 1, 5, 3, 8, 2 };
		
		for ( int i = 0 ; i < array_07.length; i++) {
			boolean b = array_07[i] > max_07;
			if ( b ) {
				max_07 = array_07[i];
			}
		}
		System.out.printf("�ִ밪�� %d�̴�.\n", max_07);
		
		
		
		// 8��
		int[][] array_08 = { {95,86}, {83,92,96}, {78,83,93,87,88} };
		int sum_08 = 0;
		double avg_08 = 0.0;
		
		for ( int i = 0 ; i < array_08.length ; i++) {
			for ( int j = 0 ; j < array_08[i].length ; j++) {
				sum_08 += array_08[i][j];
			}
			
		}
		avg_08 = (double)sum_08/10;
		
		System.out.printf("�� �� : %d, ��� : %.2f \n", sum_08, avg_08);
		
		
		
		// 9��
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("------------------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("�л��� : ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for ( int i = 0 ; i < scores.length ; i++ ) {
					System.out.printf("%d�� �л��� ���� �Է� : ", i+1);
					scores[i] = scanner.nextInt();
				}
				for ( int i = 0 ; i < scores.length ; i++ ) {
				sum += scores[i];
				}
				avg = (double)sum/scores.length;
			} else if (selectNo == 3) {
				for ( int i = 0 ; i < scores.length ; i++) {
					System.out.printf("%d��° �л��� ���� : %d\n", i+1, scores[i]);
				}
			} else if (selectNo == 4) { 
				for ( int i = 0 ; i < scores.length ; i++) {
					if ( scores[i] > max) {
						max = scores[i];
					} else if ( scores[i] < min ) {
						min = scores[i];
					}
				}
				System.out.printf("�ְ����� : %d��\n������� : %.2f��\n", max, avg);
			} else if (selectNo == 5) {
				run = false;
						System.out.println("���α׷� ����");
			}
		}
		
		

	}

}
