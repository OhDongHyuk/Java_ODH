package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		double num1 = sc.nextDouble();
		char i = sc.next().charAt(0);
		double num2 = sc.nextDouble();
		
		getAnswer(num1, i, num2);
		
		sc.close();

	}
	public static void getAnswer(double num1, char ch, double num2) {
		switch (ch) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
	    default:
	    	System.out.println("Wrong!");
		}
	}
}
