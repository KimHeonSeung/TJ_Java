
public class Operator_04 {

	public static void main(String[] args) {
		// ����/���� ������
		// ++ / --
		// Ư�� ������ ���� 1�� ����/���� ��ų�� �ִ� ������
		// ���Կ�����(=)�� ������� �ʰ� ������ ���� ������ �� �ִ�.
		
		int num;
		
		num = 10;
		System.out.printf("num -> %d\n", num);
		
		// ���Կ����ڸ� ����Ͽ� Ư�� ������ ���� 1 �����ϴ� �ڵ�. (�������� �ߺ��Ǽ� ���ȴ�.)
		num = num + 1;
		System.out.printf("num -> %d\n", num);
		
		// ���������ڸ� ����Ͽ� Ư�� ������ ���� 1 �����ϴ� �ڵ�
		num++; // num = num + 1 �� �����ϰ� ������.
		System.out.printf("num -> %d\n", num);
		
		// ������ --; �ش纯���� ���� 1 ����
		num--; // num = num - 1 �� �����ϰ� ������.
		System.out.printf("num -> %d\n", num);

	}

}
