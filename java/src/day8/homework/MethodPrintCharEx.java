package day8.homework;

import java.util.Scanner;

public class MethodPrintCharEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input char & positive number ex) *  3 : ");
		char c = sc.next().charAt(0);
		int num1 = sc.nextInt();
		
		getChar(c, num1);
		printString("*****");
		printChar('*', 5);
		System.out.println();
		printChar('*', 5, '\n');
		printChar('=', 6, '\n');
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****   
		 */
		int num = 5;
		for(int i = 1; i <= 5; i++) {
			//공백(' ')이 num - i개 출력
			printChar(' ', num - i);
			//'*'이 i가 출력 후 엔터
			printChar('*', i, '\n');
		}
		
		
		
		sc.close();

	}
    public static void getChar(char i, int num1) {
    	int a = 1;
    	while(a++ <= num1)
        		System.out.print(i);
    }
    /**문자열이 주어지면 주어진 문자열을 출력하는 메소드
     * 매개변수 : 문자열 = String str
     * 리턴타입 : 없음 => void
     * 메소드명 : printString
     * 
     */
    public static void printString(String str) {
    	System.out.println(str);
    }
    
    /**문자와 개수가 주어지면 주어진 문자를 개수만큼 출력하는 메소드
     * 매개변수 : 문자와 개수 => char ch, int count
     * 리턴타입 : 없음 => void
     * 메소드명 : printChar
     * 
     */
    public static void printChar(char ch, int count) {
    	for(int i = 1; i <= count; i++) {
    		System.out.print(ch);
    	}
    }
    
    
    /**문자와 개수, 마지막 문자가 주어지면 주어진 문자를 개수만큼 출력하고 마지막 문자를 출력하는 메소드
     * 매개변수 : 문자와 개수와 마지막 문자 => char ch, int count, char lastCh
     * 리턴타입 : 출력된 문자열 => String
     * 메소드명 : printChar
     * 메소드 오버로딩
     */
    public static String printChar(char ch, int count, char lastCh) {
    	String str = "";
    	for(int i = 1; i <= count; i++) {
    		System.out.print(ch);
    		str += ch;
    	}
    	System.out.print(lastCh);
    	str += lastCh;
    	return str;
    }
}
