import java.util.Scanner;

public class ControlStatement_SWITCH_03 {

	public static void main(String[] args) {
		// ����ڿ��� 1~10������ ������ �Է¹�������
		// �Էµ� �������� 10 ������ ������ ��� ����ϼ���.
		// switch���� ����ϼ���
		// <����> 1~10 ������ ���� �Է��� 5 => <5, 6, 7, 8, 9, 10> ���
		Scanner kb = new Scanner(System.in);
		int a;
		System.out.println("1 ~ 10 ������ ������ �Է��ϼ���.");
		a = kb.nextInt();
		kb.close();
		
		String result = "<";
		
		switch(a) {
			case 1:
				result += "1, "; // result = result + "1, ";
			case 2:
				result += "2, "; 
			case 3:
				result += "3, "; 
			case 4:
				result += "4, "; 
			case 5:
				result += "5, "; 
			case 6:
				result += "6, "; 
			case 7:
				result += "7, "; 
			case 8:
				result += "8, "; 
			case 9:
				result += "9, "; 
			case 10:
				result += "10>"; 
				break;
			default :
				result += " ERROR : �߸��� ���� >";
		}
		
		System.out.println(result);		
		
	
		/*		
		switch ( a ) {
			case 1:
				System.out.printf("<%d, %d, %d, %d, %d, %d, %d, %d, %d, %d>", a, ++a, ++a, ++a, ++a, ++a, ++a, ++a, ++a, ++a);
				break;
			case 2:
				System.out.printf("<%d, %d, %d, %d, %d, %d, %d, %d, %d>", a, ++a, ++a, ++a, ++a, ++a, ++a, ++a, ++a);
				break;
			case 3:
				System.out.printf("<%d, %d, %d, %d, %d, %d, %d, %d>", a, ++a, ++a, ++a, ++a, ++a, ++a, ++a);
				break;
			case 4:
				System.out.printf("<%d, %d, %d, %d, %d, %d, %d>", a, ++a, ++a, ++a, ++a, ++a, ++a);
				break;
			case 5:
				System.out.printf("<%d, %d, %d, %d, %d, %d>", a, ++a, ++a, ++a, ++a, ++a);
				break;
			case 6:
				System.out.printf("<%d, %d, %d, %d, %d>", a, ++a, ++a, ++a, ++a);
				break;
			case 7:
				System.out.printf("<%d, %d, %d, %d>", a, ++a, ++a, ++a);
				break;
			case 8:
				System.out.printf("<%d, %d, %d>", a, ++a, ++a);
				break;
			case 9:
				System.out.printf("<%d, %d>", a, ++a);
				break;
			case 10:
				System.out.printf("<%d>", a);
				break;
				
				default :
					System.out.println("���ڸ� �߸��Է��Ͽ����ϴ�.");
					break;				
		}
		*/
		

	}

}
