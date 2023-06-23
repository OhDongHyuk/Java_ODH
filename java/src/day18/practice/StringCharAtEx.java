package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		//강사님 방법
		Scanner sc = new Scanner(System.in);
		int a1phabet[] = new int[26]; //각 알파벳 개수를 저장하는 배열. 0번지 : a의 갯수, 1번지 ; b의 개수
		
		//입력
		System.out.println("input : ");
		String str1 = sc.nextLine();
		
		//반복 : 문자열 길이만큼
		for(int i = 0; i < str1.length(); i++) { 
			//문자열의 한글자씩 가져와서 알파벳을 확인하여 알파벳 개수를 증가
			char ch = str1.charAt(i);
			//ch가 알파벳 소문자인 경우 0~25 사이의 값이 나옴
			int distance = ch - 'a';
			//영문 소문자가 아닌 경우
			if(distance < 0 || distance > 25) {
				continue;
			}
			//맞는 경우
			a1phabet[distance]++;
		}
		//알파벳 개수 추가
		for(int i = 0; i < a1phabet.length; i++) {
			if(a1phabet[i] == 0) {
				continue;
			}
			System.out.println((char)('a' + i) + " : " + a1phabet[i]);
		}
		sc.close();
		
		System.out.println("==================");
		
		//내가한 방법
		String str = "hello world!";
		char ch;
		int index = -1;
		for(ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			do {
				index = str.indexOf(ch, ++index);//초기값이 -1이여서 0번지 시작
				if(index != -1) {
					count++;
				}
			}while(index != -1);	
			if(count != 0) {
				System.out.println(ch + " : " + count);
			}
		}
	}
}
