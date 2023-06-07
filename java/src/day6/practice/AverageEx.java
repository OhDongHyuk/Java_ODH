package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		int kor, eng, math;
		double avg;
		int menu = 0;
		String y, n;
		Scanner sc = new Scanner(System.in);
		y = sc.next();
		n = sc.next();
		while(menu != n) {
			System.out.println("input 3 score(kor, eng, math) : ");
			menu = sc.nextInt();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			avg = (double)(kor + eng + math)/3;
			System.out.println(avg);
			System.out.println("Countinue?");
			
			}
		sc.close();	
		}

	}


