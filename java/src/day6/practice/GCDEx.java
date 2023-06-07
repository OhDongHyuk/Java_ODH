package day6.practice;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 반복횟수 : i는 1부터 num1까지 1씩 증가
		 * 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 GCD에 저장
		 * 		num1을 i로 나누었을 때 나머지가 0과 같고
		 * 		num2를 i로 나누었을 때 나머지가 0과 같다면
		 * 		i를 GCD에 저장
		 * 반복문 종료 후 : GCD를 출력
		 * 
		 * 8, 12
		 * 9, 10, 11, 12
		 * */
		int i= 0, num1, num2, GCD = 1;//최대 공약수는 최소 1이기 때문에 1로 초기화
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 numbers :"); //순서
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(++i <= num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				GCD = i;
			}
		
		}
		System.out.println(num1 + " and " + num2 + " GCD : " + GCD);
		
		sc.close();

	}

}
