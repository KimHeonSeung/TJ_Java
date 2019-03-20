
public class Operator_03 {

	public static void main(String[] args) {
		// ��������
		// �ټ����� ������� �����Ͽ� �ϳ��� boolean ���� ��ȯ�� �� �ִ� ������
		// AND(&&), OR(||), NOT(!)
		
		// AND ������ (&&)
		// ���װ� ������ ������� ����� ��� ��(true)�� ��츸 true�� ��ȯ�ϴ� ������
		// ������ ����� false �� ��� ������ ���� ������ �ʴ´�. (dead code)
		System.out.printf("%5b && %5b -> %5b\n", false, false, false && false);
		System.out.printf("%5b && %5b -> %5b\n", false, true, false && true);
		System.out.printf("%5b && %5b -> %5b\n", true, false, true && false);
		System.out.printf("%5b && %5b -> %5b\n", true, true, true && true);
		System.out.println("false && false -> " + (false && false));
		
		// OR ������ (||)
		// ���װ� ������ ����� �� �ϳ��� �����(true)�� ��� true�� ��ȯ�ϴ� ������
		// ������ ����� true �� ��� ������ ���� ������ �ʴ´�. (dead code)
		System.out.printf("%5b || %5b -> %5b\n", false, false, false || false);
		System.out.printf("%5b || %5b -> %5b\n", false, true, false || true);
		System.out.printf("%5b || %5b -> %5b\n", true, false, true || false);
		System.out.printf("%5b || %5b -> %5b\n", true, true, true || true);
	
		// Not ������ (!)
		// ���׿����� ( �ϳ��� ���� ����. �ǿ����ڰ� 1��)
		// ������� ����� �����ϴ� ���� ��ȯ
		// ture -> false, false -> true
		System.out.printf("!%5b -> %5b\n", false, !false);
		System.out.printf("!%5b -> %5b\n", true, !true);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 1. �Է�
		int age = 22;
		int gender = 2; // 1 �Ǵ� 3�� ��� ����, 2 �Ǵ� 4�� ��� ����
		
		// ���� �� ������ ����Ͽ� ���̰� 20�� �̰� ������ ������ ��� �Ǵ��ϴ� ���� �ۼ��ϰ� ����� Ȯ��

		// 2. ó��
		boolean r1 = 20<=age && age<30; // 20�� ���θ� �Ǵ�
		boolean r_1 = age / 10 == 2; // �� ������ 20�� ���θ� �Ǵ�.
		
		boolean r2 = gender == 2 || gender == 4; // ������ Ȯ��
		boolean r3 = r1 && r2;
		
		// 3. ���
		System.out.printf("���̰� 20���̰� ������ �����ΰ�? -> %5b\n", r3 ); //���

	}

}
