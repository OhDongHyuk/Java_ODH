package day8.practice;

import java.util.Scanner;

public class MethodMultipleEX {

	public static void main(String[] args) {
		//System.out.println(MethodEvenNumberEx.isMultiple(num1,num2));
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 positive number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(isMultiple(num1,num2)) {
			System.out.println(num1 + " is multiple.");
		}else {
			System.out.println(num1 + " is not multiple.");
		}
		
		sc.close();
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}

}
