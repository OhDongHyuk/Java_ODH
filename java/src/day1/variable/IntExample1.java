package day1.variable;

public class IntExample1 {

	public static void main(String[] args) {
		int num2 = 11;  //십진수 11
		int num3 = 0b11;//2진수 11(0b는 2진수) == 10진수 3
		int num4 = 011; //8진수 11 == 10진수 9
		int num5 = 0x11;//16진수 11 == 10진수 17
		double num6 = 1e3; //1*10^3 == 1000
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		//1234567890123은 int로 표현할 수 없는 큰 숫자
		//long 타입에 큰 숫자를 저장한 경우 리터럴에 L또는 l을 반드시 붙여야 함
		long num7 = 1234567890123L;
	}

}
