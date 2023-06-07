package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		int i = 0, j;
		char menu = 'y';
		int max = 100, min = 1;
		Scanner sc = new Scanner(System.in);
		do {
			j = (int)(Math.random() * (max - min + 1) + min);
			do {
				System.out.println("input : ");
				i = sc.nextInt();
				
				if(i < j) {
					System.out.println("Up!");
				}else if(i > j) {
					System.out.println("Down!");
				}else {
					System.out.println("Good!");
				}
			}while(i != j);
			System.out.println("Countinue?(y/n) : ");
			menu = sc.next().charAt(0);
		}while(menu != 'n');
		sc.close();	
	}

}
