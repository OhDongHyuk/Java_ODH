package day4.homework;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		//정수 입력
		System.out.println("input integer numbers : ");
		num = sc.nextInt();
		if(num % 2 == 0) {
			num = num / 2;
			//num /= 2
		}
		//정수 num이 짝수이면 num에 2를 나누고
		//num에 2를 나눈 값을 num에 저장
		
		//아니면 num에 1을 더한 후
		//num에 1을 더한 값을 num에 저장
		else {
			//num = num +1;
			num += 1;
		}
		//num을 출력
		System.out.println(num);
		
		sc.close();

	}

}
