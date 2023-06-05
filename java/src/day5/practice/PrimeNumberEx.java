package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		int num, i = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input positive number : ");
		num = sc.nextInt();
		
		while(i++ <= num) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number.");
		}
		
		sc.close();
	}

}
