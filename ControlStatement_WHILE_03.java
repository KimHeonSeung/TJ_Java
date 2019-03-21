
public class ControlStatement_WHILE_03 {

	public static void main(String[] args) {
		// while 문을 사용하여 구구단 출력

		/*
		 * for (int i = 2 ; i <= 9 ; i++ ) { for ( int j = 1 ; j <= 9 ; j++ ) {
		 * System.out.printf("%d * %d = %d\n", i, j, i*j); } }
		 */

		int i = 2;
		int j = 1;

		while (i <= 9) {
			System.out.printf("%d단을 시작합니다.\n", i);
			while (j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			j = 1;
			System.out.println();
			i++;
		}

		/*
		 * //System.out.print("프로그램을 종료하려면 100을 입력하세요 : "); while ( kb.nextInt() != 100
		 * ) { System.out.print("프로그램을 종료하려면 100을 입력하세요 : "); }
		 */
		System.out.println("구구단 종료");

	}

}
