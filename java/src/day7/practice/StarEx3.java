package day7.practice;

public class StarEx3 {

	public static void main(String[] args) {
		/*     * i = 1, 공 = 4, * = 5
		 *    ** i = 2, 공 = 3, * = 5
		 *   *** i = 3, 공 = 2, * = 5
		 *  **** i = 4, 공 = 1, * = 5
		 * ***** i = 5, * = 5
		 * */ 		
		for(int i = 1; i <= 5; i++) {
			for(int y = 1; y <= (5 - i); y++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
