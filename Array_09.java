import java.util.*;
public class Array_09 {

	public static void main(String[] args) {
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		// (�迭�� Ȱ���Ͽ� ó��)
		Scanner kb = new Scanner(System.in);
		// ���������� �����ϱ� ���� �迭 ����
		int [] scores = new int[3];
		// ������ �����ϱ� ���� ����
		// (�ݺ��� ���ؼ� �����Ǳ� ������ �ݵ�� �ʱ�ȭ !)
		int tot = 0;
		double avg ;
		for ( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d��° ���� : ", i+1);
			// �ε����� ���� �����ϸ鼭 ���� �Է�
			scores[i] = kb.nextInt();
			// �Է��� ���� ������ ����
			tot += scores[i];
		}
		avg = (double) tot / 3;
		
		System.out.printf("���� : %d ��, ��� : %.2f ��\n", tot, avg);
		

	}

}
