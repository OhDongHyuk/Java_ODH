package day3.practice;

import java.util.Scanner;

public class Ex2Answer {

	public static void main(String[] args) {
		/*성적을 입력받아 입력받은 성적이 60점 이상이면 pass, 미만이면 failure이 출력되는 코드를 작성하세요.
          예시:
          input score : 65
          Do you pass 65 point? pass
          input score : 45
          Do you pass 45 point? failure
        */
        Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		int score = sc.nextInt();
		
		String result = score >= 60 ? "pass" : "failure";
	    System.out.println("Do you pass " + score + " point? " + result);
	        
	    sc.close();
	}

}
