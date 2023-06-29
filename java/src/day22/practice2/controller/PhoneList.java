package day22.practice2.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import day20.practice.student.vo.Student;
import day22.practice.vo.StudentSet;
import day22.practice2.vo.Phone;


public class PhoneList implements Program{

	private ArrayList<Phone> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	private static final int EXIT = 4;
	
	@Override
	public void printMenu() {
		System.out.println("Menu");
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 검색");
		System.out.println("4. 프로그램 종료");
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
		Stream<Phone> stream = list.stream();
		String name = null, num = null; 
		switch (menu) {
		case 1:
			System.out.print("Input name : ");
			String a = sc.next();
			sc.nextLine();
			System.out.print("Input number : ");
			String b = sc.nextLine();
			insertNumber(a, b);
			System.out.println(list);
			break;
		case 2:
			System.out.println("Input number : ");
			String c = sc.next();
			sc.nextLine();
			Phone tmp = new Phone(null, c);
			if(list.remove(tmp)) {
				System.out.println("Delete Success!");
				return;
			}
			System.out.println("Delete Fail!");
			break;
		case 3:
			System.out.print("Number : ");
			String d = sc.next();
			sc.nextLine();
			Phone tmp1 = new Phone(null, d);
			int index = list.indexOf(tmp1);
			if(index == 1) {
				System.out.println(tmp1);
			}
			
			break;
		case 4:
			System.out.println("Program Exit!");
			break;
		default:
		}
		
	}
	
	public void insertNumber(String name, String num) {
		Phone ph = new Phone(name, num);
		if(!list.contains(ph)) {
			list.add(ph);
			System.out.println("Insert Success!");
			return;
		}
		System.out.println("Insert Fail!");
	}
	
	private void updatePhone() {
		//수정할 학생의 정보를 입력(학년, 반, 번호) //학년 반 번호만 가지고 equals를 판별하게 만들었기 때문에
		System.out.print("Name : ");
		String name1 = sc.next();
		sc.nextLine();
		System.out.print("number : ");
		String num1 = sc.nextLine();
		
		
		//수정할 학생이 있는지 없는지 확인.
		//학생 객체를 생성
		Phone tmp = new Phone(name1, num1); //빈칸은 저렇게 null 처리
		int index = list.indexOf(tmp);
		//없으면 종료
		if(index == -1) {
			System.out.println("Update Fail!");
			return;
		}
		
		//수정될 학생정보를 입력(학년, 반, 번호, 이름)
		System.out.print("grade : ");
		grade = sc.nextInt();
		System.out.print("class : ");
		classNum = sc.nextInt();
		System.out.print("num : ");
		number = sc.nextInt();
		System.out.print("name : ");
		sc.nextLine(); //number를 입력하고 난 뒤 엔터를 처리하기 위해
		String name = sc.nextLine();
		
		//학생 정보를 수정
		//수정될 학생 정보가 이미 있는 학생인지 확인
		//수정될 정보를 이용하여 학생 객체를 생성
		tmp = new Student(grade, classNum, number, name);
		//학년, 반, 번호가 일치하는 학생이 있는지 확인해서 있으면 종료
		if(list.contains(tmp)) {
			System.out.println("Update Fail!");
		}
		list.get(index).update(grade, classNum, number, name);
	}

}
