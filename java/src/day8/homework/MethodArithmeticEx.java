package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		int num1 = sc.nextInt();
		char i = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		getAnswer(num1, i, num2);
		
		System.out.println("=====================");
		
		System.out.println(arithmetic(num1, i, num2));
		
		System.out.println("=====================");
		
		System.out.println(arithmetic2(num1, i, num2));
		
		sc.close();

	}
	public static void getAnswer(int num1, char ch, int num2) {
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
			System.out.println(num1 / (double)num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;
	    default:
	    	System.out.println("Wrong!");
		}
	}
	/**
	 * 매개변수 : 두 정수와 산술 연산자 => int num1, char operator, int num2
	 * 리턴타입 : 산술 연산 결과 => double
	 * 매서드명 : arithmetic
	 * @param num1
	 * @param ch
	 * @param num2
	 */
	public static double arithmetic(int num1, char operator, int num2) {
		double res = 0.0;
		switch(operator) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / (double)num2;
			break;
		case '%':
			res = num1 % num2;
			break; 
		//default는 예외처리를 배운 후에 함
		default :
			//throw new RuntimeException("Wrong operator!");
		}
		return res;
	}
		public static double arithmetic2(int num1, char operator, int num2) {
			switch(operator) {
			case '+':
				return num1 + num2;
				//break;//위에 return이 있기 때문에 break가 실행될 일이 절대 없음 -> 에러 발생  
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / (double)num2;
			case '%':
				return num1 % num2;
			//default는 예외처리를 배운 후에 함
			default :
				//throw new RuntimeException("Wrong operator!");
				//default에 return값이 없으면 에러 발생, 잘못된 연산자를 입력했을때 return할 값이 없기 때문
				//혹은 스위치문 밖에 return 값을 넣어야함
				return 0.0;
			}
		}
}
