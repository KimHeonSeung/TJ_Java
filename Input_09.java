import java.util.Scanner;

public class Input_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ���� ���Ḧ �����ϴ� ����
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			
			
			if ( selectNo == 1 ) {
				System.out.print("�л���> ");
				int sNo = scanner.nextInt();
				scores = new int[sNo];
			} else if ( selectNo == 2 ) {
				if (scores == null) {
					System.out.println("�л����� ���� �Է��ϼ���.");
					continue;
				}
				for ( int i = 0 ; i < scores.length ; i++ ) {
					System.out.printf("scores[%d] : ", i);
					scores[i] = scanner.nextInt();
				}
			} else if ( selectNo == 3 ) {
				if (scores == null) {
					System.out.println("������ ���� �Է��ϼ���.");
					continue;
				}
				for ( int i = 0 ; i < scores.length ; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
			} else if ( selectNo == 4 ) {
				if (scores == null) {
					System.out.println("������ ���� �Է��ϼ���.");
					continue;
				}
				int max = scores[0];
				int tot = scores[0];
				for ( int i = 1 ; i < scores.length ; i++) {
					tot += scores[i];
					if ( scores[i] > max)
						max = scores[i];
				}
				double avg = (double)tot / scores.length;
				System.out.printf("�ִ밪 : %d��\n", max);
				System.out.printf("��� : %.2f��\n", avg);
			} else if ( selectNo == 5 )
				break;
			
			
	}
		System.out.println("���α׷� ����");
}
}
