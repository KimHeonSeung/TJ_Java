import java.util.*;
public class Array_11 {

	public static void main(String[] args) {
		// ����ڿ��� �迭�� ũ�⸦ �Է¹޾� �迭�� �����ϰ�,
		// �� ��ҿ� ���� �Է¹޾� ����/����� ���
		// �ִ밪,�ּҰ� ���
		// (����)
		// �迭�� ũ�⸦ �Է��ϼ��� : 3
		// 1��° ���� : 10
		// 2��° ���� : 20
		// 3��° ���� : 30
		// �Էµ� ���� : < 10 20 30 >
		// �հ� : 60, ��� : 20.00, �ִ� : 30, �ּ� : 10
		
		Scanner kb = new Scanner(System.in);
		
		// 1. �Է�
		int array_size ;
		int [] numbers;
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		array_size = kb.nextInt();
		
		// �迭�� ũ�⸦ �Է¹��� ��, �Էµ� ������ ����Ͽ� �迭�� ����
		numbers = new int[array_size];
		
		// �ݺ����� ����Ͽ� �Էµ� ���� �迭�� ����
		for ( int i = 0 ; i < numbers.length ; i++ ) {
			System.out.printf("%d��° ���� : ", i+1);
			numbers[i]=kb.nextInt();
		}
		
		// 2. ó��
		int tot, max, min;
		double avg;
		
		// ����ڰ� �Է��� ���� �� ù��° ���� ����Ͽ� ����, �ִ�, �ּҰ��� �ʱ�ȭ��Ų��.
		tot = max = min = numbers[0];
		
		// �迭�� ù��° ��Ҵ� ���� �ڵ忡 ���� ó���� �����̹Ƿ� �ε����� ���� 1���� ����
		for ( int i = 1 ; i < numbers.length ; i++ ) {
			tot += numbers[i];
			
			if ( numbers[i] > max )
				max = numbers[i];
			
			if ( min > numbers[i] )
				min = numbers[i];
		}
		avg = (double) tot / numbers.length;
		
		// 3. ��� �� ����
		System.out.print("�Էµ� ���� : < ");
		for ( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d ", numbers[i]);
		System.out.println(">");
		
		System.out.printf("�հ� : %d, ��� : %.2f, �ִ� : %d, �ּ� : %d\n", tot, avg, max, min);
		
		
		
		
		
		
		
		
		
		
		
		
		/*           < ���� �ϴ� ���Ѱ� >
		int a, sum;
		sum = 0;
		double avg;
		int maxi, mini;
		maxi = 0;
		mini = 0;
		int max = 0; int min = 0;
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		a = kb.nextInt();
		
		int [] scores = new int[a];
		
		for ( int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%d��° ������ �Է��ϼ��� : ", i+1);
			sum += kb.nextInt();
			
			for ( int j = 0 ; j <= i ; j++ ) {
				if (scores[i] >= scores[j]) {
					max+=i;
				} else if (scores[j] <= scores[i]) {
					min+=j;
				} mini += scores[min];
			} maxi += scores[max]; 
		}
		avg = (double) sum / scores.length;
		
		System.out.printf("�հ� : %d, ��� : %.2f, �ִ� : %d, �ּ� : %d", sum, avg, maxi, mini);
		
		*/
	}

}
