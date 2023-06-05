package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input positive number : ");
		int i = 0;
		num = sc.nextInt();
		
		while(i++ <= num) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
