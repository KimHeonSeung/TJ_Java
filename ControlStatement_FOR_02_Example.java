import java.util.Scanner;

public class ControlStatement_FOR_02_Example {

	public static void main(String[] args) {
		// ����ڿ��� 2 ���� ������ �Է¹޾� 2���� ���� �� ���� ������ �����Ͽ� ū ������ Ȧ���� ����ϼ���
		// 1 ��° ���� : 5
		// 2 ��° ���� : 10
		// ��� : 5 7 9
		
		Scanner kb = new Scanner(System.in);
		int a, b, c, d ;
		System.out.print("ù��° ���� : ");
		a = kb.nextInt();
		System.out.print("�ι�° ���� : ");
		b = kb.nextInt();
		kb.close();
		
		
		// �Էµ� �ΰ��� ������ ������(���۰�) ū��(���ᰪ)���� �з�
		int start, end;
		
		if ( a > b ) {
			start = b;
			end = a;
		} else {
			start = a;
			end = b;
		}
		
		// ���ᰪ�� �����ϴ� ������ Ȧ���� ����
		end = end%2 == 0 ? end - 1 : end;
		
		System.out.print("��� : ");
		for ( int i = start ; i <= end ; i++ ) {
			if ( i % 2 == 1 )
				// ���ᰪ�� �ƴ϶�� ������ ���
				System.out.printf("%d%c ", i, i == end ? ' ' : ','); // ("%d%s, i, i != end ? ", " : "\n"); ���ε� �����ϴ�.
		}
		
		
		/* ( ���� �Ѱ� )
		if (a>b) {
			c = b; 
			d = a; }
		else {
			c = a;
			d = b; }
		
		
		
		
		for (  ; c < d ; c+=1) {
			if ( c % 2 == 1 )
				System.out.printf("%d, ", c);
		}
		*/
		
		
				

	}

}
