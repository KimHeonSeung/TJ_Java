
public class ControlStatement_IF_02 {

	public static void main(String[] args) {
		
		// if ~ else ��
		// ���ǽ��� �������� ���� ���� ������ ����� ������ �б��� �� �ִ� ����
		// ���ǽ��� ���� ��� if ���� ���Ե� ���๮�� ����
		// ���ǽ��� ������ ��� else ���� ���Ե� ���๮�� ����
		
		// ����
		// if( ���ǽ� - true/false�� ������ �и��Ǵ� �� )
		//		���ǽ��� ���� ����� ���๮;
		// else 
		// 		���ǽ��� ������ ����� ���๮;
		
		int number = 10;
		
		// if ~ else �� Ȱ���� ¦��/Ȧ�� �Ǻ� ����
		if ( number % 2 == 0 ) // ������ ������ ����� 0�� ��쿡�� ����
			System.out.printf("¦�� �Դϴ�.\n");
		else // ������ ������ ����� 0�� �ƴ� ��쿡�� ����
			System.out.printf("Ȧ�� �Դϴ�.\n");
		
		// �ֹε�Ϲ�ȣ�� 7��° �ڸ��� ����
		int gender = -999;
		
		if ( gender == 1 || gender == 3 )
			System.out.printf("���� �Դϴ�.\n");
		else
			System.out.printf("���� �Դϴ�.\n");

	}

}
