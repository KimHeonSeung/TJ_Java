import java.util.Scanner;
public class Input_01 {

	public static void main(String[] args) {
		// ���α׷� �ۼ��� �⺻����
		// �Է� 
		// ������ ���
		// �ڷ��� ������;
		
		// ���� �ڷ���  : int(4), long(8)
		// �Ǽ� �ڷ���  : double(8)
		// ���� �ڷ���  : char(2) {'A', '��' : ������, �ѱ� ��� 2byte} ��� 2����Ʈ��.
		// ���ڿ�	    : String
		// ������	�ڷ���: boolean(1)

		// �̸�, ����, ����, Ű, ����ó
		
		Scanner kb = new Scanner(System.in);
		String name;
		int age;
		char gender;
		double h;
		String tel;
		
		System.out.print("�̸��� �Է��ϼ���. : "); 
		name = kb.next();
		System.out.print("���̸� �Է��ϼ���. : ");
		age = kb.nextInt();
		System.out.print("������ �Է��ϼ���. ����/���� : ");
		gender = kb.next().charAt(0);
		System.out.print("Ű�� �Է��ϼ���. : ");
		h = kb.nextDouble();
		System.out.print("����ó�� �Է��ϼ���. : ");
		tel = kb.next();
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+gender);
		System.out.println("Ű : "+h);
		System.out.println("����ó : "+tel);
		
		
	}

}
