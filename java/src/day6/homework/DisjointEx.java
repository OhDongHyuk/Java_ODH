package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		int i= 0, num1, num2, GCD = 1;//최대 공약수는 최소 1이기 때문에 1로 초기화
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 numbers :"); //순서
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(++i <= num1) {
			if(num1 % i == 0 && num2 % i == 0) {
				GCD = i;
			}
		
		}
		switch(GCD) {
		case 1:
			System.out.println("Disjoint!");
		    break;
		default :
			System.out.println("Not Disjoint!");
		
		}
		
		sc.close();
	}

}
