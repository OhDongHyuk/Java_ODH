package quiz.test12.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import homework.phone.day23.vo.PhoneBook;
import quiz.test12.vo.Student;

public class StudentProgram implements Program{

	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 3;
	private ArrayList<Student> list = new ArrayList<>();
	private Student st = new Student(0, null, null);
	
	@Override
	public void printMenu() {
		
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void run() {
		int menu;
		load();
		do {
			System.out.println("===========");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("===========");
		}while(menu != EXIT);
		save();
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
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
	
	@Override
	public void load() {
		try(FileInputStream fis = new FileInputStream("text.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){

			st = (Student)ois.readObject();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void save() {
		try(FileOutputStream fos = new FileOutputStream("text.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(st);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
