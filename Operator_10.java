
public class Operator_10 {

	public static void main(String[] args) {
		// ������ ������ �� �ִ� gender ������ �����ϰ�,
		// gender ������ �ֹε�Ϲ�ȣ 7��° �ڸ��� ������ �ʱ�ȭ�ϼ���.
		// gender ������ ���� ���Ͽ� ������ ����ϼ���
		// (1~4������ ������ �ʱ�ȭ)
		// (1,3�� ����, 2,4�� ����)
		
		
		// 1. �Է�
		int gender;
		gender = 2;
		
		boolean man = gender == 1 || gender == 3;

		String result;
		result = man ? "����" : "����";
		
		/*String result1;
		  String result2;
		result1 = (gender = 1)||(gender = 3) ? "����" : "����";
		result2 = (gender / 2) == 0 ? "����" : "����" */
		
		System.out.printf("�� ����� %s �Դϴ�.\n", result);

		
		// 2. ó��
		/* String result = "";
		 * result = gender == 1 || gender == 3 ? "����" : "����"; �̷��� �ϸ� ���ڰ� -999 �� ���� �����̶� ����.
		 * 
		 * result = gender == 1 || gender == 3 ? "����" : result;
		 * result = gender == 2 || gender == 4 ? "����" : result;
		 * System.out.printf("����� '%s' �Դϴ�.\n", result);
		 * 
		 */
		
		String res = "";
		res = gender == 1 || gender == 3 ? "����" : res;
		res = gender == 2 || gender == 4 ? "����" : res;
		
		System.out.printf("�� ����� %s �Դϴ�.", res);
		
	}

}
