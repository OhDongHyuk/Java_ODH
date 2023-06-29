package day22.practice.controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.vo.StudentSet;

public class StudentManger4 implements Program {
	
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
		Stream<StudentSet> stream = list.stream();
		int grade = 1, classNum = 1, num = 1;
		switch(menu) {
		case 1:
			stream.forEach(std -> System.out.println(std));
			break;
		case 2:
			//검색할 학년 입력
			System.out.print("grade : ");
			final int grade1 = sc.nextInt();
			stream
			/* filter는 매개변수로 Predicate 인터페이스와 객체가 필요
			 * Predicate를 구현한 익명 클래스를 람다식으로 만든 후에 객체를 생성해서 전달
			 * */
				.filter(std -> std.getGrade() ==  grade1)//std는 매개변수 이름이라 뭘 써도 상관없음
				//.filter(new Predicate<Student>() {
				//     @Override
				//		public boolean test(Student t) {
				//			return t.getGrade() == grade1;
				//		}
				//})
				.forEach(std -> System.out.println(std));
			break;
		case 3:
			//검색할 학년, 반, 번호 입력
			System.out.print("grade : ");
			final int grade2 = sc.nextInt();
			System.out.print("classNum : ");
			final int classNum2 = sc.nextInt();
			System.out.print("number : ");
			final int num2 = sc.nextInt();
			stream
				.filter(std -> std.equals(new StudentSet(grade2, classNum2, num2, " ")))
				.forEach(std -> System.out.println(std));
			break;
		default:
		}
		
	}
	
	private void print(Predicate<StudentSet> p) {
		for(StudentSet tmp : list) {
			if(p.test(tmp))
				System.out.println(tmp);
		}
	}

}
