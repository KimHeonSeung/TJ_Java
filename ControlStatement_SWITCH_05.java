import java.util.Scanner;

public class ControlStatement_SWITCH_05 {

	public static void main(String[] args) {
		// ����ڿ��� 1~12 ���� ������ �Է¹�������.
		// �Էµ� ������ �ش�Ǵ� ���� ���� ���� ����ϼ���.
		// EX) 1~12�� �� �ϳ��� �Է��ϼ��� : 5
		//		�Էµ� 5���� '31'�� ���� �ֽ��ϴ�.
		// switch�� ���
		
		Scanner kb = new Scanner(System.in);
		
		int a, b;
		System.out.print("1~12�� �� �ϳ��� �Է��ϼ��� : ");
		a = kb.nextInt();
		kb.close();
		
		
		
		// 31���� ��  : 1 3 5 7 8 10 12, 28�� �� : 2, �������� 30��
		switch (a) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				b = 31;
				break;
			case 4:	case 6:	case 9:	case 11:	
				b = 30;
				break;
			case 2:
				b = 28;
				break;
			default:
				b = -1;
				break;
		}
		
		if ( b != -1 )
			System.out.printf("�Էµ� %d���� '%d'�� ���� �ֽ��ϴ�.\n", a, b);
		else
			System.out.printf("(ERROR) 1~12 ������ ������ �Է��ϼ���. (%d)\n", a);

	}

}
