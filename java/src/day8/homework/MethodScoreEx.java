package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		double num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input score : ");
		num1 = sc.nextDouble();
		
		System.out.println(num1 + " is " + isScore1(num1));
		
		
		System.out.println(getGrade(num1));

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
	
	/**성적이 주어지면 학점을 알려주는 메소드
	 * 매개변수 : 성적 => 실수 => double
	 * 리턴타입 : 학점 => 문자열 => String
	 * 메소드명 : getGrade
	 */
	public static String getGrade(double score) {
		if(score > 100 || score <0) {
			return "Wrong score!";
		}
		/* 100점 => A
		 * 90점 => A
		 * 80점 => B
		 * 70점 => C
		 * 60점 => D
		 * 그외 => F
		 * */
		int res = (int)(score/10); //앞자리 수에 따라 등급이 결정되기 때문에 score/10을 해준것
		switch(res) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}

}
