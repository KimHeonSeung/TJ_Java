
public class Exercise {

	public static void main(String[] args) {
		// 2��
		
		// 4��
		int age;
		age = 10;
		double price = 3.14;
		
		// 5��
		byte byteValue = 10;
		char charValue = 'A';
		int intValue = byteValue;
		int intValue1 = charValue;
		//short shortValue = charValue; // charŸ���� intŸ������ ����Ǿ� int�� �����ؾ��Ѵ�.
		double doubleValue = byteValue;
		
		// 6��
		int iV = 10;
		char cV = 'A';
		double dV = 5.7;
		String sV= "A";
		double var = (double) iV;
		byte var1 = (byte) iV;
		int var2 = (int) dV;
		//char var3 = (char) sV; // ū ũ���� Ÿ���� sV�� ���� ũ���� Ÿ���� char�� ��ȯ�� �� ����.
		
		// 7��
		int v1 = 10;
		long v2 = 10000000000L;
		//char v3 = ''; // '' �ȿ� �ƹ��͵� ����.
		double v4 = 10;
		float v5 = 10;
		
		// 8��
		byte byV = 10;
		float flV = 2.5F;
		double doV = 2.5;
		//byte r = byV + byV; // ������ intŸ������ ����Ǿ���.
		int r1 = 5 + byV;
		float r2 = 5 + flV;
		double r3 = 5 + doV;
		
		
		
		// 3��
		
		// 2��
		int x = 10 ;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31�� ���
		
		// 3��
		int score = 85;
		String result = (!(score>90)) ? "��" : "��" ;
		System.out.println(result); // �� �� ���
		
		// 4��
		int pencils = 534;
		int students = 30; 
		// �л� �Ѹ��� ������ ������ ��
		int pencilsPerStudent = ( 534 / 30 );
		System.out.println(pencilsPerStudent);
		// ���� ������ ��
		int pencilsLeft = (534%30);
		System.out.println(pencilsLeft);
		
		// 5��
		int value = 356;
		System.out.println(value-56);
		
		// 6��
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)*height/2.0;
		System.out.println(area);
		
		// 7��
		int m = 10;
		int n = 5;
		System.out.println((m>7) && (n<=5));
		System.out.println((m%3 == 2) || (n%2 != 1));
		
		// 8��
		double k = 5.0;
		double l = 0.0;
		double p = k%l;
		if (Double.isInfinite(p) || Double.isNaN(p)) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double re = p + 10;
			System.out.println("���: "+re);
		}
			

	}

}
