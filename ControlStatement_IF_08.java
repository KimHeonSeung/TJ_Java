import java.util.Scanner;

public class ControlStatement_IF_08 {

	public static void main(String[] args) {
		// �α����� ó���ϴ� ���α׷� ����
		// ID�� Password�� ��� ����, ID�� nID ����, Pass�� nPassword�� ���� ( Ű�����Է��� ����Ͽ� ó�� )
		// �Էµ� ID�� Password�� ���� 3 �Ǵ� 5�� ����� ��� �α��� ����
		// �ƴϸ� �α��� ����
		
		Scanner kb = new Scanner(System.in);
		
		int nID, nPassword, sum;
		
		System.out.print("ID�� �Է��ϼ���. ");
		nID = kb.nextInt();
		
		System.out.print("Password�� �Է��ϼ���. ");
		nPassword = kb.nextInt();
		kb.close();
		
		sum = nID + nPassword;
		
		boolean result;
		
		result = sum%3==0 || sum%5==0;
		
		if ( sum % 3 == 0 || sum % 5 == 0)
			System.out.println("\n�α��ο� �����Ͽ����ϴ�.");
		else 
			System.out.printf("\n�α��ο� �����Ͽ����ϴ�. \nID�� Password�� Ȯ���ϼ���. \n(ID : %d, Password : %d)\n", nID, nPassword);
		
		if ( result )
			System.out.println("�α��� ����");
		else
			System.out.println("���̵�� �н����带 Ȯ���ϼ���.");

	}

}
