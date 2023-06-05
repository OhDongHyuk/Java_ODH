package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		int i = 0, j;
		int max = 100, min = 1;
		Scanner sc = new Scanner(System.in);
		j = (int)(Math.random() * (max - min + 1) + min);
		while(i != j) {
			System.out.println("input : ");
			i = sc.nextInt();
			
			if(i < j) {
				System.out.println("Up!");
			}
			else if(i > j){
				System.out.println("Down!");
			}
			else if(i == j) {
				System.out.println("Good!");
			}
		}
		
		sc.close();

	}

}
