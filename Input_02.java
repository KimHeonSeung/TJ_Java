import java.util.Scanner;

public class Input_02 {

	public static void main(String[] args) {
		// ���� 2���� �Է¹޾� �հ踦 ���
		
		Scanner kb = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("���� 1�� �Է� : ");
		n1 = kb.nextInt();
		System.out.print("���� 2�� �Է� : ");
		n2 = kb.nextInt();
		
		// ó������
		int r1 = n1 + n2;
		int r2 = n1 * n2;
		double r3 = n1 / n2;
		int r4 = n1 % n2;
		
		
		
		// ���
		System.out.printf("%d + %d = %d\n", n1, n2, r1);
		System.out.printf("%d * %d = %d\n", n1, n2, r2);
		System.out.printf("%d / %d = %.2f\n", n1, n2, r3);
		System.out.printf("%d %% %d = %d\n", n1, n2, r4);
		
		
		

	}

}
