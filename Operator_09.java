
public class Operator_09 {

	public static void main(String[] args) {
		// ���׿�����
		// ���ǽ� ����� ���� �� �Ǵ� ���� �б��� �� �ִ� ������
		// ���ǽ� : ���� �������� ������ ��
		// ������ ������ ����.
		// ���ǽ� ? ���ǽ��� ���� ����� ��/�� : ���ǽ��� ������ ����� ��/��;
		// (���ǽ��� ���迬���� �Ǵ� �������ڸ� �����Ͽ� �ۼ�)
		
		int number = 6;
		
		// ¦�� / Ȧ�� �޼����� �����ϴ� ����
		String result;
		String result1;
		result = number % 2 == 0 ? "¦��" : "Ȧ��";
		result1 = number % 3 != 0 ? "3�� ����� �ƴ�" : "3�� ���";
		
		System.out.printf("%d ������ %s �Դϴ�.\n", number, result);
		System.out.printf("%d ������ %s �Դϴ�.\n", number, result1);
		

	}

}
