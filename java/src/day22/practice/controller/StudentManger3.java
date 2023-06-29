package day22.practice.controller;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.vo.StudentSet;

public class StudentManger3 implements Program {
	
	private List<StudentSet> list = Arrays.asList(//Arrays에서 제공하는 asList
			new StudentSet(1,1,1,"Hong"),
			new StudentSet(1,1,2,"Ling"),
			new StudentSet(2,1,1,"Park"),
			new StudentSet(3,1,1,"Lee"),
			new StudentSet(3,3,2,"Kim")
			);
	private Scanner sc = new Scanner(System.in);
	private static final int EXIT = 4;	
	
	@Override
	public void printMenu() {
		System.out.println("Menu");
		System.out.println("1. 학생 전체 출력");
		System.out.println("2. 학생 학년 출력");
		System.out.println("3. 학생 검색 출력");
		System.out.println("4. 종료");
		System.out.print("Select : ");
	}

	@Override
	public void run() {
		System.out.println("Program Start!");
		
		int menu;
					
		do {
			try {
			printMenu();
			menu = sc.nextInt();
			
			runMenu(menu);
			}catch(InputMismatchException e) {//예외처리
				menu = EXIT-1; //메뉴가 EXIT가 아니기만 하면 작동하니 EXIT-1를 취함
				sc.nextLine(); //앞에서 잘못 입력한 내용을 비워줌
				System.out.println("Wrong Input!");
			}
		}while(menu != EXIT);
		
		
	}

	@Override
	public void runMenu(int menu) {
		int grade = 1, classNum = 1, num = 1;
		switch(menu) {
		case 1:
			printAll();
			break;
		case 2:
			//검색할 학년 입력
			System.out.print("grade : ");
			final int grade1 = sc.nextInt();
			printGrade(grade1);
			break;
		case 3:
			//검색할 학년, 반, 번호 입력
			System.out.print("grade : ");
			final int grade2 = sc.nextInt();
			System.out.print("classNum : ");
			final int classNum2 = sc.nextInt();
			System.out.print("number : ");
			final int num2 = sc.nextInt();
			printStudent(grade2, classNum2, num2);
			break;
		default:
		}
		
	}
	private void printStudent(int grade, int classNum, int num) {
		Stream<StudentSet> stream = list.stream();
		stream
			.filter(s->s.getGrade() == grade 
			&& s.getClassNum() == classNum
			&& s.getNum() == num)
			.forEach(name -> System.out.println(name));
	}
	
	
	private void printGrade(int grade) {
		Stream<StudentSet> stream = list.stream();
		stream
			.filter(s->s.getGrade() == grade)
			.forEach(grade1 -> System.out.println(grade1));
	}
	
	private void printAll() {
		Stream<StudentSet> listStream = list.stream();
		listStream.forEach(s->System.out.println(s));
		
	}
	
	
	private void print(Predicate<StudentSet> p) {
		for(StudentSet tmp : list) {
			if(p.test(tmp))
				System.out.println(tmp);
		}
	}

}
