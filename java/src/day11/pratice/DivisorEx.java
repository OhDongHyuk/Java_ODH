package day11.pratice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//정수 num의 약수들을 배열에 저장하는 코드를 작성하세요. 약수는 최대 10개까지 저장
		//12 : 1 2 3 4 6 12
		//0번지 : 1 .... 5번지 : 12
		
		int [] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input positive number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j <= arr.length; j++) {	
				if(num % i == 0) {
					arr[j] = i;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
			System.out.println(i + " area : " + arr[i]);
			}
		}
		
		sc.close();
	}

}
