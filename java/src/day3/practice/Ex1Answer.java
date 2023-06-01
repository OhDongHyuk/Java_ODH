package day3.practice;

import java.util.Scanner;

public class Ex1Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input score : ");
		int score = sc.nextInt();
		
        boolean result = score >= 60;
        System.out.println("Do you pass " + score + " point? " + result);
        
		sc.close();
		
	}

}
