package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number : ");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			System.out.println(num1 + " is even number.");
		}else {
			System.out.println(num1 + " is odd number.");
		}
		printEvenNumber(num1);
		
		if(mod(num1,2) == 0) {
			System.out.println(num1 + " is even number.");
		}else {
			System.out.println(num1 + " is odd number.");
		}
		
		if(isEvenNumber(num1)) {
			System.out.println(num1 + " is even number.");
		}else {
			System.out.println(num1 + " is odd number.");
		}
		
		if(isMultiple(num1,2)) {
			System.out.println(num1 + " is even number.");
		}else {
			System.out.println(num1 + " is odd number.");
		}
		sc.close();
	}
	/**num가 주어지면 num가 짝수인지 홀수인지 출력하는 메소드
	 * @param num : 판별항 정수
	 * @return 없음 void
	 * 메서드명 : printEvenNumber
	 * */
	public static void printEvenNumber(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is even number.");
		}else {
			System.out.println(num + " is odd number.");
		}
	}
	/**num1과 num2가 주어지면 num1을 num2로 나누었을 때 나머지를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 나누었을 때 나머지 => 정수 => int
	 * 메소드명 : mod
	 */
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	/**num가 주어지면 num가 짝수인지 홀수인지 알려주는 메소드
	 * 매개변수 : 판별할 정수 => int num
	 * 리턴타입 : 짝수인지(참) 홀수인지(거짓) => boolean 
	 * 메소드명 : isEvenNumber
	 */
	public static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	/**num1과 num2가 주어지면 num1이 num2의 배수인지 아닌지 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 배수(참)인지 아닌지(거짓) = boolean
	 * 메소드명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
