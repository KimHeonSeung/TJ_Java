import java.util.Scanner;
public class ControlStatement_FOR_04_Example {

	public static void main(String[] args) {
		// ����ڿ��� 3���� ������ �Է¹޾� �Էµ� ������ �հ�, ���, �ִ밪, �ּҰ��� ���
		// ���� �Է��� �ݺ������� ó��
		
		
		// 1. �Է� �� ó��
		Scanner kb = new Scanner(System.in);
		// 3���� �������� �Է¹ޱ� ���� num ����
		int num;
		// �հ�, �ִ밪, �ּҰ�
		// �հ躯���� ���� �����ؾ� �ϹǷ� �ݵ�� �ʱ�ȭ�� �ʿ��ϴ�.
		int sum = 0, max = 0, min = 0;
		// ���
		double avg;
		
		for (int i = 1 ; i <= 3 ; i++) {
			System.out.printf("%d ��° ���� �Է� : ", i);
			num = kb.nextInt();
			sum += num;
			
			// �ִ밪�� �ּҰ��� ����ϴ� �ڵ�
			// ���ǻ��� : �ִ밪�� �ּҰ��� ���ϱ� ���ؼ� �ԷµǴ� �� �� ���ʷ� �Էµ� ������ �ʱ�ȭ�� �����ؾ� �Ѵ�.
			if ( i == 1 ) {
				max = min = num;
			} else {
				if ( num > max )
					max = num;
				if ( min > num )
					min = num;
			}
		}
		avg = (double)sum/3;
		
		
		
		System.out.printf("�հ� : %d, ��� : %.2f\n", sum, avg);
		System.out.printf("�ִ� : %d, �ּ� : %d\n", max, min);
		
				
				
		/*
		System.out.print("ù��° ���� : ");
		a = kb.nextInt();
		System.out.print("�ι�° ���� : ");
		*/

	}

}
