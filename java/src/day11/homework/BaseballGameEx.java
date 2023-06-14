package day11.homework;

import java.util.Scanner;
import java.util.zip.CRC32;

public class BaseballGameEx {

	public static void main(String[] args) {
		// 1 ~ 9 사이의 중복되지 않은 세 수를 맞추는 게임. 3S까지 하는 것
		// 규칙 :것
		// B : 같은 숫자가 있지만 위치가 다름
		// S : 같은 숫자가 있고 위치가 같음
		// 30 : 일치하는 숫자가 하나도 없음
		// 예 :
		// 랜덤 숫자 : 1 9 5
		// 사용자 : 1 4 9 => 1S 1B
		// 사용자 : 2 7 4 => 30
		
		int [] arr1 = new int[3];
		int [] arr2 = new int[3];
		int i, strike = 0, count = 0, ball = 0;		
		createRandomArray(1, 9, arr1);
		printArr(arr1);
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input numbers : " );
		for(i = 0; i < 3; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.print("User numbers : ");
		for(i = 0; i < 3; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println(" ");
		for(i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr1[i] == arr2[j] && i != j) {
					ball++;
				}
				if(arr1[i] != arr2[j]) {
					count++;
				}
			}
			if(arr1[i] == arr2[i]) {
				strike++;
			}
		}
		if(count == 9) {
			System.out.println("30");
		}
		if(strike != 0) {
			System.out.print(strike + "S" + " ");
		}
		if(ball != 0) {
			System.out.println(ball + "B");
		}
		sc.close();
		
	}
	public static void printArr(int arr[]) {
		int i;
		System.out.print("Random numbers : ");
		for(i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static boolean contains2(int arr[], int num, int count) {
		for(int i = 0; i < count; i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void createRandomArray(int min, int max, int arr[]) {
		//배열이 생성되어 있지 않으면(배열이 null이면) 메소드 종료
		if(arr == null) {
			return;
		}
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메소드를 종료
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return;
		}
		//배열이 생성
		int count = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			if(!contains2(arr, random, count)) {
				arr[count] = random;
				count++;
			}
		}
	}
	
}
