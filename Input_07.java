import java.util.Scanner;

public class Input_07 {

	public static void main(String[] args) {
		// ����ڿ��� ���� 1�� �Է�
		// �ݵ�� ����� �Է¹ޱ�
		// 1���� ����ڰ� �Է��� �������� ���
		
		Scanner kb = new Scanner(System.in);
		int a;
		int sum = 0;
		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			a = kb.nextInt();
		} while ( a <= 0);
		
		// �Ʒ��� for���� �����Ͽ� ����ڰ� �Է��� ���������� �Ҽ��� ����ϼ���.
		// �Ҽ� : 1�� �ڱ��ڽ� �ܿ� ������ �������� �ʴ� ��
		
		
		out:
		for ( int i = 2 ; i <= a ; i++) {
			
			for (int j = 2 ; j < i / 2 ; j++) {
				if (i % j == 0 )
					continue out;
			}						
			System.out.printf("%d ", i);
		}

	}

}
