import java.util.Scanner;

public class Input_06 {

	public static void main(String[] args) {
		// ����ڿ��� ���� n1, n2 2���� �Է¹ޱ�
		// �Էµ� ���� n1���� n2���� Ȧ�� ���
		// 1��° ���� : 1
		// 2��° ���� : 5
		// 1 3 5
		// 1��° ���� : 10
		// 2��° ���� : 3
		// 9 7 5 3
		
		Scanner kb = new Scanner(System.in);
		
		// 1. �Է�
		int n1, n2;
		System.out.printf("1��° ���� : ");
		n1 = kb.nextInt();
		System.out.printf("2��° ���� : ");
		n2 = kb.nextInt();
		// i <= n2
		for ( int i = n1 ; (n1 < n2 && i <=n2) || (n1>n2 && i>=n2) ; i = (n1 > n2 ? i-1 : i+1 )) {
			if ( i%2 == 1 ) {
				System.out.printf("%d ", i);
			}
		}
		
		
		/*
		
		int n1,n2;
		int min = 0;
		
		
		for ( int i = 0 ; i < 2 ; i++) {
			System.out.printf("%d��° ���� : ", i+1);
			if ( i == 0 ) {
			n1 = kb.nextInt();
			} else if ( i == 1 ) {
				n2 = kb.nextInt();
			}
		}
		
		if ( min > n1 ) {
			
		}
		
		*/

	}

}
