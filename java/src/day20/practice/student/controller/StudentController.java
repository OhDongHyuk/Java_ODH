package day20.practice.student.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.student.vo.Student;



public class StudentController implements Program {
	
		private final static int EXIT = 4;
		private Scanner sc = new Scanner(System.in);
		private ArrayList<Student> list = new ArrayList<>();
		String name;

		@Override
		public void run() {
			System.out.println("Program Start!");
			
			int menu;
			
			do {
				try {
				System.out.println(list);
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
		public void printMenu() {
			System.out.println("Menu : ");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 수정");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
		}

		@Override
		public void runMenu(int Menu) {
			switch(Menu) {
			case 1:
				insertStudent();
				break;
			case 2:
				updateStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				System.out.println("Program Exit!");
				break;
			default:
			}
		}
		private void insertStudent() {
			//추가할 학생의 정보를 입력(학년, 반, 번호, 이름)
			System.out.print("grade : ");
			int grade = sc.nextInt();
			System.out.print("class : ");
			int classNum = sc.nextInt();
			System.out.print("num : ");
			int number = sc.nextInt();
			System.out.print("name : ");
			sc.nextLine(); //number를 입력하고 난 뒤 엔터를 처리하기 위해
			String name = sc.nextLine();
			
			//입력한 정보를 이용하여 학생 객채를 생성
			Student std = new Student(grade, classNum, number, name);
			//학생 정보를 리스트에 추가
				//학생이 있는지 없는지 확인해서 없으면 추가
			if(!list.contains(std)) {
				list.add(std);
				System.out.println("Insert Success!");
				return;
			}
			//추가 성공하면 추가했다고, 실패하면 실패했다고 출력
			System.out.println("Insert Fail!");
			
		}
		private void deleteStudent() {
			//삭제할 학생 정보를 입력(학년, 반, 번호)
			System.out.print("grade : ");
			int grade = sc.nextInt();
			System.out.print("class : ");
			int classNum = sc.nextInt();
			System.out.print("num : ");
			int number = sc.nextInt();
			//삭제할 학생정보를 이용하여 학생 객체를 생성
			Student tmp = new Student(grade, classNum, number, null);
			//삭제를 시도해서 성공하면 성공했다고, 실패하면 실패했다고 알려줌
			if(list.remove(tmp)) {//remove return 값이 true
				//삭제 성공
				System.out.println("Delete Success!");
				return;
			}
			System.out.println("Delete Fail!");
		}
		private void updateStudent() {
			//수정할 학생의 정보를 입력(학년, 반, 번호) //학년 반 번호만 가지고 equals를 판별하게 만들었기 때문에
			System.out.print("grade : ");
			int grade = sc.nextInt();
			System.out.print("class : ");
			int classNum = sc.nextInt();
			System.out.print("num : ");
			int number = sc.nextInt();
			
			//수정할 학생이 있는지 없는지 확인.
			//학생 객체를 생성
			Student tmp = new Student(grade, classNum, number, null); //빈칸은 저렇게 null 처리
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
















