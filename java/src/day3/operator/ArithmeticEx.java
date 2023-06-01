package day3.operator;

public class ArithmeticEx {

	public static void main(String[] args) {
		/* byte + 정수나 char + 정수는 결과가 int이여서 byte나 char에 바로 저장할 수 없음
		 * 자료형 변환을 이용해서 저장해야 한다.
		 * */
		byte num1 = 3;
		num1 = (byte)(num1 + 5);//num1는 바이트, 5는 int라 형변환 필요
		char ch = 'A';
		System.out.println(ch);
		ch = (char)(ch + 1);
		System.out.println(ch);
		int num2 = 3;
		num2 = (int)(num2 + 4.0);
	}

}
