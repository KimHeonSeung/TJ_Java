import java.util.Scanner;

public class PrE {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		char G;
		System.out.print("������ �Է��ϼ���. (M �Ǵ� W) : " );
		G = kb.next().charAt(0);
		

		
		String N;
		System.out.print("�̸��� �Է��ϼ��� : ");
		N = kb.next();
		
		
		int a;
		System.out.print("���� ���� : ");
		a = kb.nextInt();
		System.out.printf("%s��(%c)���� ���� ������ %d�� �Է��ϼ̽��ϴ�.\n",N,G, a);
		
		int b;
		System.out.print("���� ���� : ");
		b = kb.nextInt();
		System.out.printf("%s��(%c)���� ���� ������ %d�� �Է��ϼ̽��ϴ�.\n",N,G, b);
		
		int c;
		System.out.print("���� ���� : ");
		c = kb.nextInt();
		System.out.printf("%s��(%c)���� ���� ������ %d�� �Է��ϼ̽��ϴ�.\n",N,G, c);
		
		int s = a + b + c;
		double g = s/3.0;
		
		char e;
		System.out.print("������ ����� Ȯ���Ϸ��� Enter�� ��������.");
		e = kb.next().charAt(0);
		
		
		
		System.out.printf("%s��(%c)�� ������ %d�̰�, ����� %.2f�Դϴ�.",N,G,s,g );

		
		
		
	}
}
