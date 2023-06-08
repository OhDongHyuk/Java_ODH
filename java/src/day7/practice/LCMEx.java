package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		/* 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		 * */
		
		//방법 1
		int num1, num2, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 positive numbers : ");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		for(i = 1; i <= num1 * num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {// i % num1 == 0 (배수 표현, 약수의 반대)
				System.out.println(i);
				break;	
			}
		}
		
		System.out.println("============================");
		
		//방법 2(훨씬 효율적인 방법)

		System.out.println("Input 2 positive numbers : ");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		for(i = num1; i <= num1 * num2; i += num1) {
			if(i % num2 == 0) {
				System.out.println(i);
				break;	
			}
		}
		
		sc.close();

	}

}
