package day12.homework;

import java.util.Scanner;

import array.Array;

public class LottoEx {

	public static void main(String[] args) {
		// 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇 등인지 출력하는 코드를 작성하세요. 45번 까지
		// 1등 : 번호 6개
		// 2등 : 번호 5개 + 보너스
		// 3등 : 번호 5개
		// 4등 : 번호 4개
		// 5등 : 번호 3개
		// number : [1, 3, 40, 23, 24, 45]
		// bonus : 2
		// user : 1 2 3 4 5 6
		// losing ticket!
		int lottoNum[] = new int[7];
		int user[] = new int[6];
		int min = 1, max = 45;
		int correct = 0;
		int bonus = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Array.createRandomArray(min, max, lottoNum);
		Array.printArray(lottoNum);
		
		do {
			int ncount = 0;
			// 사용자가 숫자 6개를 입력
			System.out.print("user : ");
			for(int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
				ncount++;
			}
			if(ncount != user.length) {
				System.out.println("Error!");
				continue;
			}
			
			//사용자 입력 체크 ex) 1,1,2
			if(Array.arrayCheck(user)) {
				System.out.println("You must not enter the same number!");
				continue;
			}
			
			//판별
			//맞은 개수 판별
			correct = correct(lottoNum, user);
			bonus = bonus(lottoNum, user);
			
			printResult(correct, bonus);
			
		}while(correct < 3);
		System.out.println("Good!");
		
		sc.close();
	}
	
	public static int correct(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < arr1.length - 1; i++) {
			for(int j =0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int bonus(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int bonus =0;
		for(int i = 0; i < arr2.length; i++) {
			if(arr1[6] == arr2[i]) {
				bonus++;
			}
		}
		return bonus;
	}
	
	public static void printResult(int correct, int bonus) {
		if(correct == 6) {
			System.out.print("1");
		}else if(correct == 5 && bonus == 1) {
			System.out.println("2");
		}else if(correct == 5) {
			System.out.print("3");
		}else if(correct == 4) {
			System.out.print("4");
		}else if(correct == 3) {
			System.out.print("5");
		}else {
			System.out.println("losing ticket!");
		}
		System.out.println();
	}
}
