import java.util.*;
public class Array_10 {

	public static void main(String[] args) {
		// �迭�� ũ��� ���α׷����� �߿��� �����̴�.
		// �迭�� ũ�⿡ ���� �ݺ��� Ƚ���� Ư�� �ε����� ���� �����ϴ� ���� ���÷� �ٲ�� �����̴�.
		// �迭�� �̷��� ������ �ذ��ϱ� ���� length ��� �Ӽ��� �����Ѵ�.
		// �迭�� �̸�.length -> �迭�� ũ�Ⱑ ����Ÿ������ ����.
		
		
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		// (�迭�� Ȱ���Ͽ� ó��)
		Scanner kb = new Scanner(System.in);
		// ���������� �����ϱ� ���� �迭 ����
		int [] scores = new int[5];
		// ������ �����ϱ� ���� ����
		// (�ݺ��� ���ؼ� �����Ǳ� ������ �ݵ�� �ʱ�ȭ !)
		int tot = 0;
		double avg ;
		for ( int i = 0 ; i < scores.length ; i++ ) { // scores��� �迭�� ���� ũ�Ⱚ���� �ٲ�
			System.out.printf("%d��° ���� : ", i+1);
			// �ε����� ���� �����ϸ鼭 ���� �Է�
			scores[i] = kb.nextInt();
			// �Է��� ���� ������ ����
			tot += scores[i];
		}
		avg = (double) tot / scores.length;
		
		System.out.printf("���� : %d ��, ��� : %.2f ��\n", tot, avg);
		

	}

}
