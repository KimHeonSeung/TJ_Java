import java.util.*;
public class Array_08 {

	public static void main(String[] args) {
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		Scanner kb = new Scanner(System.in);
		
		int s1,s2,s3;
		System.out.print("1��° ���� : ");
		s1=kb.nextInt();
		System.out.print("2��° ���� : ");
		s2=kb.nextInt();
		System.out.print("3��° ���� : ");
		s3=kb.nextInt();
		
		int tot = s1 + s2 + s3;
		double avg = (double) tot / 3;
		
		System.out.printf("���� : %d ��, ��� : %.2f ��\n", tot, avg);
		

	}

}
