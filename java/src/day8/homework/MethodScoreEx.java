package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		double num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input score : ");
		num1 = sc.nextDouble();
		
		System.out.println(num1 + " is " + isScore1(num1));

	}
	
	public static String isScore1(double num2) {
    	if(num2 >= 4.0 && num2 <= 4.5) {
    		return "A+";
    	}
    	else if(num2 >= 3.5 && num2 < 4.0) {
    		return "A";
    	}
    	else if(num2 >= 3.0 && num2 < 3.5) {
    		return "B+";
    	}
    	else if(num2 >= 2.5 && num2 < 3.0) {
    		return "B";
    	}
    	else if(num2 >= 2.0 && num2 < 2.5) {
    		return "C+";
    	}
    	else if(num2 >= 1.5 && num2 < 2.0) {
    		return "C";
    	}
    	else if(num2 >= 1.0 && num2 < 1.5) {
    		return "D+";
    	}
    	else if(num2 >= 0.5 && num2 < 1.0) {
    		return "D";
    	}
    	else if(num2 >= 0.0 && num2 < 0.5) {
    		return "F";
    	}
		else {
			return "Wrong Score";
		}
				
    }

}
