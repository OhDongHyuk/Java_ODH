package day8.homework;

import java.util.Scanner;

public class MethodPrintCharEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input char & positive number ex) *  3 : ");
		char i = sc.next().charAt(0);
		int num1 = sc.nextInt();
		
		getChar(i, num1);
		
		
		sc.close();

	}
    public static void getChar(char i, int num1) {
    	int a = 1;
    	while(a++ <= num1)
        		System.out.print(i);
    }
}
