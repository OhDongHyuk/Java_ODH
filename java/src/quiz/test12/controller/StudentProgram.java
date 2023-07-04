package quiz.test12.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import quiz.test12.vo.Student;

public class StudentProgram implements Program{

	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 3;
	private ArrayList<Student> list = new ArrayList<>();
	
	@Override
	public void printMenu() {
		inPut();
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void run() {
		int menu;
		do {
			System.out.println("===========");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("===========");
		}while(menu != EXIT);
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			outPut();
			break;
		case 2:
			printAll();
			break;
		case 3:
			System.out.println("EXIT!!");
			break;
		default:
			System.out.println("Wrong Menu!!");
		}
	}

	private void printAll() {
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		
	}

	private void insertStudent() {
		System.out.print("학번 : ");
		int grade = sc.nextInt();
		System.out.print("과 : ");
		String classNum = sc.next();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		Student std = new Student(grade, classNum, name);
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("Insert Success!");
			return;
		}
		System.out.println("Insert Fail!");
		
	}
	
	private void outPut() {
		try(FileWriter fos = new FileWriter("output1.txt")) {
			fos.write(list);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void inPut() {
		try(FileReader fis = new FileReader("output1.txt")) {
		int data;
		while((data = fis.read()) != -1) {
			System.out.println((char)data);
		}
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
