package day28.baseball.controller;

import java.util.Scanner;

public class GameController implements Program {

	private Scanner sc = new Scanner(System.in);
	private static final int EXIT = 3;
	prviate BaseBallGame bbGame();
	
	@Override
	public void printMenu() {
		System.out.println("Menu");
		System.out.println("1. Play");
		System.out.println("2. Record");
		System.out.println("3.Exit");
		System.out.print("Select Menu : ");
	}

	@Override
	public void run() {
		int menu;
		String fileName = "src/day28/baseball/baseball.txt";
		load(fileName);
		do {
			//메뉴 출력
			System.out.println("=============");
			printMenu();
			//메뉴 선택(메뉴를 입력 받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
			System.out.println("=============");
			
		}while(menu != EXIT);
		save(fileName);
		sc.close();
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			play();
			break;
		case 2:
			recordGame();
			break;
		case 3:
			break;
		default:	
		}
		
	}

	private void recordGame() {
		// TODO Auto-generated method stub
		
	}

	private void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
}
