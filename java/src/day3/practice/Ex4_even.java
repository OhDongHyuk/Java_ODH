package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
        //정수 num를 입력받아 num가 홀수인지 짝수인지 판별하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is a even number.");
		}
		if(num % 2 == 1) {
			System.out.println(num + " is a odd number.");
		}
		sc.close();
	}

}
