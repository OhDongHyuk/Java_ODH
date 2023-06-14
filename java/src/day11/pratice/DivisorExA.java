package day11.pratice;

import java.util.Scanner;

public class DivisorExA {

	public static void main(String[] args) {
		int num, count = 0;
		int divisor[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				divisor[count] = i; //
				count++;
			}
			if(count == divisor.length) {
				break;
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(divisor[i]);
		}
		
	    sc.close();	
	}

}
