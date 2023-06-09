package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month : ");
		month = sc.nextInt();
		
		System.out.println(month + " is " + getSeason(month));
				
	}

	/**월이 주어지면 주어진 월에 맞는 계절을 알려주는 메소드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 계절 => String
	 * 메소드명 : getSeason
	 */
	public static String getSeason(int month) {
		if(month == 3 || month == 4 || month == 5) {
			return "Spring";
		}
		//month가 6이거나 7이거나 8이면 Summer 출력
		else if(month == 6 || month == 7 || month == 8) {
			return "Summer";
		}
		//month가 9이거나 10이거나 11이면 Fall 출력
		else if(month == 9 || month == 10 || month == 11) {
			return "Fall";
		}
		//month가 12이거나 1이거나 2이면 	Winter 출력
		else if(month == 12 || month == 1 || month == 2) {
			return "Winter";
		}
		//아니면 Wrong Month 출력
		else {
			return "Wrong Month";
		}
				
	}
}
