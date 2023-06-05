package day5.practice;

import java.util.Scanner;

public class MulitpicationTableEx {

	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input integer number : ");
		int j = sc.nextInt();
		
		while(i <= 9) {
			System.out.println(j + " X " + i++ + " = " + j * i);
		}
		
		sc.close();

	}

}
