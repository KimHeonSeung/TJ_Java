import java.util.Scanner;

public class Input_03 {

	public static void main(String[] args) {
		// ���� 2���� ��Ģ���� ��ȣ�� �Է¹޾� ����� ���
		
		Scanner kb = new Scanner(System.in);
		int n1, n2;
		char buho;
		
		System.out.print("���� 1�� �Է� : ");
		n1 = kb.nextInt();
		System.out.print("��ȣ �Է� : ");
		buho = kb.next().charAt(0);
		System.out.print("���� 2�� �Է� : ");
		n2 = kb.nextInt();
		
		// ó������. �Է°����� ó�������� ������.
		int r ;
		if (buho == '+')
			r = n1 + n2;
		else if (buho == '-')
			r = n1 - n2;
		else if (buho == '*')
			r = n1 * n2;
		else if (buho == '/')
			r = n1 / n2;
		else
			r=0;
		
		
		
		// ���
		System.out.printf("%d %c %d = %d\n", n1, buho, n2, r);

	}

}
