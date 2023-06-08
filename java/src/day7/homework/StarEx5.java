package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (5 - i); j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= (i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}				
			
		for(int k = 1; k <= 5; k++)	{
			for(int j = 1; j <= k; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= (5 - k); j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= (4 - k); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
