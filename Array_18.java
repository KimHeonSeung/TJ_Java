import java.util.*;
public class Array_18 {

	public static void main(String[] args) {
		// 3���� �л� ������ ó���� �� �ִ� ���α׷�
		// ������ 5����, ����ڰ� �Է��� ������ ����
		// ��� �л��� �Է��� ���� �� �� �л��� ������ ���  ���
		// 2���� �迭�� ���
		
		Scanner kb = new Scanner(System.in);
		
		// �л����� ������ �����ϱ� ���� 2���� �迭
		int [][] scores = new int [3][5];
		// �� �л����� ������ �����ϱ� ���� 1���� �迭
		int [] tot = new int [3];
		// �� �л����� ����� �����ϱ� ���� 1���� �迭
		double [] avg = new double [3];
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d��° �л� ������ �Է��մϴ�.\n", i+1);
			for ( int j = 0 ; j < 5 ; j ++ ) {
				System.out.printf("%d��° ������ �Է� : ", j+1);
				scores[i][j] = kb.nextInt();
				// �� ������ �Է� �� ���� �迭�� ����
				tot[i] += scores[i][j];
			}
			avg[i] = (double)tot[i]/5;
		}
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d��° �л��� ���� : %d��, ��� : %.2f��\n", i+1, tot[i], avg[i]);
		}
		
		
		/* < ���� �Ѱ� >
		int[][] array_scores = new int[3][5];
		double avg;
		
		
		int [][] array_tot = new int [1][3];
		
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			
			for ( int j = 0 ; j < 5 ; j++ ) {
				
				System.out.printf("%d��° �л��� %d��° ���� ���� : ", i+1, j+1);
				array_scores[i][j] = kb.nextInt();
				array_tot[0][0] += array_scores[0][j];
				array_tot[0][1] += array_scores[1][j];
				array_tot[0][2] += array_scores[2][j];

			}
			System.out.printf("%d��° �л��� ������ %d��, ����� %.2f�� �Դϴ�.\n\n", i+1, array_tot[0][i], array_tot[0][i]/3.0);
		}
		*/
	}

}
