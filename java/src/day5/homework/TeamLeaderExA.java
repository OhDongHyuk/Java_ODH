package day5.homework;

import java.util.Scanner;

public class TeamLeaderExA {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		//학생 번호를 입력
		System.out.println("input student number");
		num = sc.nextInt();
		
		//학생 번호가 팀장번호인지 아닌지를 판별
		//번호가 3의 배수이면 팀장이라고 출력하고 아니면 팀원이라고 출력
		//num를 3의로 나누었을 때 나머지가 0과 같다면 팀장 아니면 팀원으로 출력
		//num % 3 == 0
		
		switch(num % 3) {
		case 0:
			System.out.println("Student number " + num + " is team leader.");
		break;
		default:
			System.out.println("Student number " + num + " is a member of student.");
			
		}
		
		sc.close();

	}

}
