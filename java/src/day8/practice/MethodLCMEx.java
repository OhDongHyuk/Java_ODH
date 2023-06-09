package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		// 최소공배수는 = num1 * num2 / (num1 과 num2의 최대공약수)
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 positive numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int LCD1 = LCD(num1, num2);
		
		System.out.println(LCD1 + " is " + num1 + " and " + num2 + "'s LCD");
		
		sc.close();
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
	public static int GCD(int num1, int num2) {
		for(int i = num1; i >= 1; i--) {
			if(isMultiple(num1,i) && isMultiple(num2,i)) {
				return i;
			}
		}
		return 1;
	}
	public static int LCD(int num1, int num2) {
		return num1 * num2 / GCD(num1, num2);
	}

}
