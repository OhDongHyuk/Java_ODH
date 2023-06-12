package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month : ");
		num1 = sc.nextInt();
		
		System.out.println(num1 + " is " + getMonth(num1));
		
		System.out.println("==============");
		printMonth(num1);
		
		System.out.println("==============");
		System.out.println(getMonth(num1));

		
		sc.close();
	}
	public static String getMonth(int num1) {
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
	
	/**월이 주어지면 주어진 월의 영문을 출력하는 메소드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 없음 => void
	 * 메소드명 : printMonth
	 */
	public static void printMonth(int month) {
		switch(month) {
		case 1: System.out.println("January");    break;
		case 2: System.out.println("Febuary");    break;
		case 3: System.out.println("March");      break;
		case 4: System.out.println("April");      break;
		case 5: System.out.println("May");        break;
		case 6: System.out.println("Jnue");       break;
		case 7: System.out.println("July");       break;
		case 8: System.out.println("August");     break;
		case 9: System.out.println("September");  break;
		case 10: System.out.println("October");   break;
		case 11: System.out.println("November");  break;
		case 12: System.out.println("December");  break;
		default: System.out.println("Wrong month!");
		}
	}
	
	/**월이 주어지면 주어진 월의 영문을 알려주는 메소드
	 * 매개변수 : 월 => int month
	 * 리턴타입 : 월의 영문 => String
	 * 메소드명 : getMonth2
	 */
	public static String getMonth2(int month) {
		switch(month) {
		case 1: return "January";
		case 2: return "Febuary"; 
		case 3: return "March";
		case 4: return "April";      
		case 5: return "May";        
		case 6: return "Jnue";       
		case 7: return "July";       
		case 8: return "August";     
		case 9: return "September";  
		case 10:return "October";   
		case 11:return "November";  
		case 12:return "December";  
		default:return "Wrong month!";
		}
	}
}
