
public class Variable_01 {

	public static void main(String[] args) {
		// ���� : ������ �޸� ������ (RAM) �̸��� �ٿ� �����ϴ� ���. (���α׷��� ����ǰ� �ִ� ���� ���� �����ϴ� ����� ����)
		
		// ������ �����ϴ� ���
		// �ڷ���  ������;
		// �ڷ��� : �������� Ÿ��
		// - ���� : byte(1), short(2), int(4) = �⺻��, long(8)
		// - �Ǽ� : float(4), double(8) = �⺻��
		// - ���� : char(2) = �����ڵ� ����
		// - ������ : boolean(1) = true, false ���� ���� ����
		// - ���ڿ� : String Ŭ������ ���
		
		// 4byte ũ���� �޸� ������ ������ ������ �� �ִ� ���� num�� ����
		// �������� ù���ڸ� �ҹ��ڷ� �ۼ��ϴ� ���� �Ϲ��� ��.
		// ���� �ܾ�� ������ ��� ù�ܾ� ù���ڴ� �ҹ���, �ι�° �ܾ���ʹ� ù���ڸ� �빮�ڷ� �ۼ�.
		// ex) int inputNum;
		int num1;
		int num2;
		int num3;
		double num4 = 3.141592;
		
		// ������ ���� �Ҵ��ϱ� ���ؼ� ���Կ�����(=)�� ���
		num1 = 101; // �����ʿ� �ִ°��� ���ʿ� �־��ְڴٴ� �ǹ�.
		num2 = 202;
		num3 = 303;
		
		System.out.printf("num = %d\n", num1);
		System.out.printf("%d + %d = %d\n", num1, num2, num3*(num1+num2));
		System.out.printf("�������� %f�̴�.\n", num4);
		System.out.printf("%s", "sierjgserjgpsoeirjgpseirgj\n");
		System.out.println("sierjgserjgpsoeirjgpseirgj");
		System.out.println(3.1546498);
		System.out.println(4.54684684);
		System.out.println("����" + "�ٶ�");
		System.out.println("����"+"+"+"�ٶ�");
		System.out.println(num1+"ȣ");
		System.out.println(num1+num3);
		System.out.println(num1+num3+"ȣ");
		System.out.println("Hi ~ "+(num1+num3)+"ȣ");
		System.out.println("t"+"j"+"��"+"ī"+'��'+'��');
		System.out.println("num1"+num1);
		System.out.println('1'+1);
		
		System.out.println('1'+'0'); // 1, 0�� ����� ���ڰ� ��µǴ� �� 0 = 48, 1 = 49�� ���ڿ� ����Ǿ�����

	}

}
