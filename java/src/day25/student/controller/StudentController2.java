package day25.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.student.vo.Student;

public class StudentController2 {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int menu;
		List<Student> list = new ArrayList<>();
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택(메뉴를 입력 받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu, sc, list);
			
		}while(menu != 3);
		sc.close();
	}
	private void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생확인");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	private void runMenu(int menu, Scanner sc, List<Student> list) {
		switch(menu) {
		case 1:
			insertStudent(sc, list);
			break;
		case 2:
			print(list);
			break;
		case 3:
			break;
		default:	
		}
	}
	
	
	public void insertStudent(Scanner sc, List<Student> list) {
		String num, name, major;
		Student tmp;
		//학생정보입력
		//학번
		System.out.println("학번 : ");
		num = sc.next();
		//이름(문자열, 공백이 있는)
		sc.nextLine();
		System.out.println("이름 : ");
		name = sc.nextLine();
		//과(문자열, 공백이 있는)
		System.out.println("과 : ");
		major = sc.nextLine();
		//학생정보 리스트에 저장
		//입력한 정보를 이용하여 학생 객체를 생성
		tmp = new Student(num, name, major);
		//리스트에 학생 객체를 추가
		list.add(tmp);
	}
	
	public void print(List<Student> list) {
		//학생 전체를 확인
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
}

































