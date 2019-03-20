
public class PrintMethods {

	public static void main(String[] args) {
		// �⺻ ��� ��ü�� ��� �޼ҵ�
		// 1. print �޼ҵ�
		//  - �Ű������� ȭ�鿡 ����ϰ�, �ڵ����� �������� �ʴ� �޼ҵ�
		// �Ű����� : �޼ҵ��� �Ұ�ȣ ���ο� ���ǵ� ��
		System.out.print("Hello "); // -> Hello
		System.out.print("Java~!"); // -> Hello Java~!
		
		// ������ ������ �ϰ��� �ϴ� ��� ���๮��( \n )�� ����Ѵ�.
		System.out.print("Hello \n"); // -> Hello Java~!Hello \n
		System.out.print("Java~!\n"); // -> Hello Java~!Hello \nJava~!\n
		
		// 2. println �޼ҵ�
		// - �Ű������� ȭ�鿡 ����ϰ�, �ڵ����� �����ϴ� �޼ҵ�
		// - �Ű������� ������� �ʴ� ��� ���ุ ����
		System.out.println(); // ���๮�ڸ� ���
		System.out.println("Hello Java~!");
		System.out.println("Javaaaaaaaa");
		
		// 3. printf �޼ҵ�
		// - �Ű������� ���޵� ���ڿ��� ����Ͽ� ���Ŀ� ���� ����� �� �ִ� �޼ҵ�
		// - printf("���Ĺ��ڿ�", ��1, ... ,��N);
		// - ���Ĺ��ڿ� ���ο� ����� �� �ִ� ����
		// - �ڵ������� �������� ����
		// %d : 10������ �������� ����� �� �ִ� ����
		// %f : �ε� �Ҽ��� ���� ����� �� �ִ� ����
		// %s : ���ڿ� ���� ����� �� �ִ� ����
		// %c : �ϳ��� ���ڰ��� ����� �� �ִ� ���
		System.out.printf("%d + %d = %d\n", 10, 2, 10+7);
		System.out.printf("�� �̸��� %s �Դϴ�.\n", "������");
		System.out.printf("�������� ���� %f �Դϴ�.\n", 3.1464453687654);
		System.out.printf("������ %c �����Դϴ�.\n", '��'); // %c�� �ϳ��� ����. ���ڸ� ����� ������ ���� ����ǥ ''�� ����.
		
		System.out.println();
		System.out.println("����");
	}

}
