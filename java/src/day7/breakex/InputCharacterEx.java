package day7.breakex;

import java.util.Scanner;

public class InputCharacterEx {

	public static void main(String[] args) {
		// q를 입력하면 반복문을 종료하는 예제
		
		char ch;
		Scanner sc = new Scanner(System.in);
		
		for( ; ; ) { //for문은 조건식이 생략되면 항상 참
			System.out.println("Input char (Exit : q) : ");
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				break;
		}
		}
		
		sc.close();

	}
}
