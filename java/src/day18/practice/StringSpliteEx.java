package day18.practice;

import java.util.Scanner;

public class StringSpliteEx {

	public static void main(String[] args) {
		//강사님 방법
		//문장 입력
		System.out.println("Input : ");
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.nextLine();
		//공백을 기준으로 단어를 배열에 저장
		String words1[] = str1.split(" ");
		//개수 출력
		System.out.println("Words : " + words1.length);
		sc1.close();
		
	}

}
