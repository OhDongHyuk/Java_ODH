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
		
		int LCM1 = LCM1(num1, num2);
		
		System.out.println(LCM1 + " is " + num1 + " and " + num2 + "'s LCM");
		
		int LCM2 = LCM(num1, num2);
		
		System.out.println(LCM2 + " is " + num1 + " and " + num2 + "'s LCM");
		
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
	public static int LCM(int num1, int num2) {
		return num1 * num2 / GCD(num1, num2);
	}
	public static int LCM1(int num1, int num2) {
		for(int i = num1; i<= num1 * num2; i += num1) {
			//공배수를 찾음, isMultiple은 배수를 찾는 메소드이고
			//i가 num1의 배수들이기 때문에 i가 num2의 배수이면 num1과
			//num2의 공배수가 됨
			if(isMultiple(i,num2)) {
				return i;
			}
		}
		return num1 * num2;
	}

}
