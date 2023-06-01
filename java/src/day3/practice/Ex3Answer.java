package day3.practice;

import java.util.Scanner;

public class Ex3Answer {

	public static void main(String[] args) {
		//정수 num를 입력받아서 num가 0인지, 음수인지, 양수인지를 판별하는 코드를 if문을 이용하여 작성하세요.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input integer : ");
		num = sc.nextInt();
		
		if(num == 0) {
			System.out.println(num + " is 0");
		}
		//음수 => 0보다 작다
		if(num < 0) {
			System.out.println(num + " is a negative number");
		}
		//양수 => 0보다 크다
        if(num > 0) {
        	System.out.println(num + " is a pasitive number");
        }
        sc.close();

	}

}
