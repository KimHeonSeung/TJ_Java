// ������
// �����ڴ� �ڹ� ���� ����� �� �ִ� ��ȣ���� ����
// +, -, %, >>, <<, &&, || ...
// �������� ���ԵǴ� �ǿ����ڿ� �������� ��ȯ���� Ȯ���ؾ���.

public class Operator_01 {

	public static void main(String[] args) {
		// ���������
		// +, -, *, /, %(������ ������)
		int n1 = 10;
		int n2 = 7;
		// ��������� ����� �����ϱ� ���� ����
		int result;
		
		result = n1+n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		
		result = n1-n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		
		result = n1*n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		
		// ������ ���� : �������̿����� ������ ��� ������ ��ȯ�ȴ�.
		result = n1/n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		
		// ������ ���� : ���װ� ������ ���� ����� ������ ���� ��ȯ.
		// ¦�� �Ǵ� ����� �Ǵ��ϴ� ��� Ȱ��
		result = n1%n2;
		System.out.printf("%d %c %d = %d\n", n1, '%', n2, result);
		
		
		byte b1 = 10;
		byte b2 = 7;
		// �ڹٿ��� ��������ڴ� ���� ���̿����� ������ int�� ��ȯ�ȴ�.
		// �Ʒ��� ���� byte �Ǵ� short Ÿ���� ������ ��������� ����� ���Թ޴� ��� ������ ������ �߻�
		// byte b3 = b1 + b2; // int b4 = b1 + b2; �� �������
		// ���� ����ȯ�� ���� ��������� ����� byte �Ǵ� short Ÿ���� ������ ������ �� �ִ�.
		byte b3 = (byte)(b1 + b2);
		
		// �������� ���� �Ǵ� ������ �Ǽ��� ��� �ش� �Ǽ��� Ÿ���� ��ȯ
		// ���� + float -> float ��ȯ
		// double + ���� -> double
		// double + float -> double

	}

}
