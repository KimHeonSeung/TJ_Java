import java.util.Scanner;


public class ControlStatement_IF_07 {

	public static void main(String[] args) {
		// ����ڷκ��� 3���� ���� ���� �Է¹޾� ������ ����� ����ϼ���. (Ű���� �Է��� ���)
		
		// ��������� ����Ͽ� ������ �򰡸� ����ϼ���.
		// 90�� �̻��� A, 80 B, 70 C, 60 D , 60 �̸��� F
		
		Scanner kb = new Scanner(System.in);
		
		int a;
		System.out.print("ù��° ������ �Է��ϼ���. ");
		a = kb.nextInt();
		
		int b;
		System.out.print("�ι�° ������ �Է��ϼ���. ");
		b = kb.nextInt();
		
		int c;
		System.out.print("����° ������ �Է��ϼ���. ");
		c = kb.nextInt();
		
		kb.close();
		
		
		int d = a + b + c;
		double e = d/3.0;
		
		System.out.printf("\n�Է��Ͻ� ������ %d��, %d��, %d������\n������ %d�̰� ����� %.2f�Դϴ�.\n",a,b,c, d, e);
		
		if ( e >= 90 && e <= 100 )
			System.out.print("\n����� ������ A�Դϴ�.");
		else if ( e >= 80 && e < 90)
			System.out.print("\n����� ������ B�Դϴ�.");
		else if ( e >= 70 && e < 80)
			System.out.print("\n����� ������ C�Դϴ�.");
		else if ( e >= 60 && e < 70)
			System.out.print("\n����� ������ D�Դϴ�.");
		else if ( e < 60)
			System.out.print("\n����� ������ F�Դϴ�."); // �޼����� �ٲٰ� ���� �� �ߺ��Ǵ� ����� �ٹٲ�����ؼ� �����ϴ�.
		
		// Ư�� ������ ���Ͽ� if ���� ó���ϴ� ����� ó�����
		// 1. �̻�ġ �����͸� ��
		// 2. ���� ������(���� ������) ������ �񱳸� ����
		char grade;
		if (e<0 || e>100)
			grade = '?';
		else if (e>=90)
			grade = 'A';
		else if (e>=80)
			grade = 'B';
		else if (e>=70)
			grade = 'C';
		else if (e>=60)
			grade = 'D';
		else 
			grade = 'F';
		
		
		
		
		
		// ���� ó�� �ڵ�
		/*
		char grade;
		
		if ( e >= 90 && e <= 100 )
			grade = 'A';
		else if ( e >= 80 && e < 90 )
			grade = 'B';
		else if ( e >= 70 && e < 80 )
			grade = 'C';
		else if ( e >= 60 && e < 70 )
			grade = 'D';
		else
			grade = 'F';
		*/
		
		if (grade != '?')
			System.out.printf("\n���� �򰡴� '%c'�Դϴ�.\n", grade);
		else
			System.out.printf("\n(ERROR)���������� Ȯ���ϼ���. (%.2f)\n",e);
	}

}
