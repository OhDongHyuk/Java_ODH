package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month : ");
		num1 = sc.nextInt();
		
		System.out.println(num1 + " is " + getMonth(num1));

		
		sc.close();
	}
	public static String getMonth(int num1) { // break 에러 질문하기
		switch(num1) {
		case 1:
		    return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Wrong Month";
		
		}
	}
}
