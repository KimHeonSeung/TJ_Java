
public class Array_16 {

	public static void main(String[] args) {
		// 2���� �迭�� ���� �� �ʱ�ȭ ���
		// 1. 2���� �迭�� ������ ������ �� 2���� �迭�� �Ҵ��ϴ� ���
		int [][] arr_1;
		// 0���� �ʱ�ȭ��  2�� 3���� �迭�� ��ȯ
		arr_1 = new int[2][3];
		
		// 2. 2���� �迭�� ����� ���ÿ� 2���� �迭�� �Ҵ��ϴ� ���
		// 0���� �ʱ�ȭ�� 2�� 3���� �迭�� ��ȯ
		int[][] arr_2 = new int[2][3];
		
		System.out.println(arr_1[0][0]);
		System.out.println(arr_2[0][0]);
		
		// 2������ ������ �ʱⰪ�� �����ϴ� ���
		// { {1���� �迭�� ���}, {1���� �迭�� ���}}
		int [][] arr_3 = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(arr_3[1][1]);
		
		int [][] arr_4 = {{1,2,3},{4,5,6}};
		
		System.out.println(arr_4[1][1]);
		

	}

}
