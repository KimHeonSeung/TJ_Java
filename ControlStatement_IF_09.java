import java.util.Scanner;

public class ControlStatement_IF_09 {

	public static void main(String[] args) {
		// �α����� ó���ϴ� ���α׷� ����
		// ID�� Password�� ��� ����, ID�� nID ����, Pass�� nPassword�� ���� ( Ű�����Է��� ����Ͽ� ó�� )
		// �Էµ� ID�� Password�� 3 �Ǵ� 5�� ����� ��� �α��� ����
		// �ƴϸ� �α��� ����
		
		Scanner kb = new Scanner(System.in);
		
		int nID, nPassword, sum;
		
		System.out.print("ID�� �Է��ϼ���. ");
		nID = kb.nextInt();
		
		System.out.print("Password�� �Է��ϼ���. ");
		nPassword = kb.nextInt();
		kb.close();
		

		
		// ID üũ
		boolean flag_id = nID%3==0 || nID%5==0;
		// Password üũ
		boolean flag_password = nPassword%3==0 || nPassword%5==0;
		// �α��� ó�� ����� �����ϴ� ����
		boolean result = flag_id && flag_password;
		
		// ID�� Password�� �и��Ͽ� ó��
		if(flag_id) {
			// ����� ��ø�� ���
			// �ڹ��� ����� ���ο� �� �ٸ� ����� ������ �� �ִ�.
			if(flag_password) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� - �н����带 Ȯ���ϼ���");
			}	
		} else {
			System.out.println("�α��� ���� - ���̵� Ȯ���ϼ���");
		}
			
		
		/*
		// result ������ ����Ͽ� �α��� ���θ� �Ǵ��ϴ� ��� ID �Ǵ� Password �� �� ��������� ������ �߻��ߴ��� Ȯ���� �� ����.
		if ( result )
			System.out.println("�α��� ����");
		else
			System.out.println("���̵�� �н����带 Ȯ���ϼ���.");
		*/
		
	}

}
