import java.util.*;
public class ControlStatement_WHILE_02 {

	public static void main(String[] args) {
		// ����ڰ� 100�� �Է��� �� ���� �ݺ��ؼ� �Է¹޴� ����
		Scanner kb = new Scanner(System.in);
		
		// while ���� ����� ���ѷ��� ����
		while ( true ) {
			System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : ");
			if (kb.nextInt() == 100)
				break;
		}
		
		
		
		/*
		//System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : ");
		while ( kb.nextInt() != 100 ) {
			System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : ");
		}
		*/
		System.out.println("���α׷� ����");
		

	}

}
