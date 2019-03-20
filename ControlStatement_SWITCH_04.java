import java.util.Scanner;
public class ControlStatement_SWITCH_04 {

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
		double f = e/10;
		char grade;
		
		// ��������� �����ϰ� �ִ� e�� �Ǽ��� double �̹Ƿ� switch ���� ���޵� �� ����.
		// ���� ����ȯ�� ���� ���������� �����Ѵ�.
		// ��������� ������ ���� �ۼ��ϱ⿡ ����Ƿ� ������ ���
		// ��������� ���������� ��ȯ�� ��, /10 �� �Ͽ� 10���ڸ��� ����
		// ��������� 0~10���� ����
		// 99/10->9
		// 9/10->0	
		
		// e�� 100���� ũ�ų� 0���� ������ -1, �׷��� ������ (int)e/10
		// ���� �����ڷ� �����ش�. Operator_09.java ����.
		switch( e>100 || e<0 ? -1 : (int)e / 10 ) {
			// 100���� 90������ �򰡸� �� ���� ó��
			case 10 :
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			// 50 40 30 20 10 0 �� ���� �򰡸� �� ���� ó��
			case 5 :  
			case 4 :  
			case 3 :  
			case 2 :  
			case 1 :  
			case 0 : grade = 'F'; break; 
				default :
					grade = '?';
		}
			if (grade != '?')
				System.out.printf("���� �򰡴� %c �Դϴ�.\n", grade);
			else
				System.out.printf("(ERROR) ���� ������ Ȯ���ϼ��� (%.2f)\n", e);
			
			/* (���� �� ���)
			switch ((int)f) {
				case 10 :
					if(f==10.0)
						System.out.println("���� : 'A'");
					else
						System.out.println("ERROR : ������ �߸��Է��߽��ϴ�.");
					break;
				case 9 :
					System.out.println("���� : 'A'");
					break;
				case 8 :
					System.out.println("���� : 'B'");
					break;
				case 7 :
					System.out.println("���� : 'C'");
					break;
				case 6 :
					System.out.println("���� : 'D'");
					break;
				case 5 :
					System.out.println("���� : 'F'");
					break;
				case 4 :
					System.out.println("���� : 'F'");
					break;
				case 3 :
					System.out.println("���� : 'F'");
					break;
				case 2 :
					System.out.println("���� : 'F'");
					break;
				case 1 :
					System.out.println("���� : 'F'");
					break;
				case 0 :
					System.out.println("���� : 'F'");
					break;
				default :
					System.out.println("ERROR : ������ �߸��Է��߽��ϴ�.");
					break;
				*/
		
	}

}
