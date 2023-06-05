package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("input student number : ");
		i = sc.nextInt();
		switch(i) {
		case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
			System.out.println(i + " is a teamleader.");
		    break;
		default: 
			System.out.println(i + " is a teammate.");
		
		}
		sc.close();
		

	}

}
