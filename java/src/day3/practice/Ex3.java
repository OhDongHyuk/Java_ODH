package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//정수 num를 입력받아서 num가 0인지, 음수인지, 양수인지를 판별하는 코드를 if문을 이용하여 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("input integer : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println(num + " is 0");
		}
		if(num > 0) {
			System.out.println(num + " is pasitive number");
		}
        if(num < 0) {
        	System.out.println(num + " is negative number");
        }
        sc.close();
	}

}
