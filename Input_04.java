import java.util.Scanner;

public class Input_04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		// �ݺ��� - ������

		int dan;
		
		// 2 ~ 9 ������ ���� �Էµ� �� ���� �ݺ��ؼ� �Է�

		do {
			System.out.print("���ϴ� �ܼ��� �Է��ϼ��� : ");
			dan = kb.nextInt();
		} while( dan < 2 || dan > 9);

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		// resolved : ��Ÿ�ų� ������ Ʋ�Ȱų�.

	}

}
