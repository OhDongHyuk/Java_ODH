package day15.practice.shop.controller;

import java.util.Scanner;

import day15.practice.shop.shop.ShopEx;



public class ShopManager{
	
	private Scanner sc = new Scanner(System.in);
	private ShopEx note = new ShopEx();
	public void run() {
		
		System.out.println("프로그램 시작!!");
		int menu = -1;
		final int EXIT = 6;//상수
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//메뉴 선택에 따른 기능 실행
			runMenu(menu);
			
		}while(menu != EXIT);			
		System.out.println("프로그램 종료!!");
		sc.close();
	}
	private void printMenu() {
		System.out.println("==================");
		System.out.println("메뉴");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회");
		System.out.println("5. 고객 등록");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	private void runMenu(int menu) {
		
		switch(menu) {
		//메뉴가 1이면 단어 추가 기능을 실행
		case 1 :
			System.out.println("==============");
			insertCustomer();
			System.out.println("==============");
			break;
		//메뉴가 2이면 단어 삭제 기능을 실행
		case 2 :
			System.out.println("==============");
			insertItem();
			System.out.println("==============");
			break;
		//메뉴가 3이면 단어 수정 기능을 실행
		case 3 :
			System.out.println("==============");
			updateItem();
			System.out.println("==============");
			break;
		//메뉴가 4이면 단어 출력 기능을 실행
		case 4 :
			System.out.println("==============");
			System.out.println("==============");
			break;
		//메뉴가 5이면 프로그램을 종료
		case 5 :
			System.out.println("==============");
			System.out.println("고객 등록");
			System.out.println("==============");
			break;
		case 6 :
			System.out.println("==============");
			System.out.println("프로그램 종료");
			System.out.println("==============");
			break;
		//메뉴가 그 외이면 잘못된 메뉴라고 출력
		default :	
			System.out.println("==============");
			System.out.println("잘못된 메뉴");
			System.out.println("==============");
		}
	}
	private void insertCustomer() {
		//추가할 단어를 입력
		System.out.print("고객 : ");
		String customer = sc.next();
		
		//단어에서 입력한 엔터를 처리
		sc.nextLine();
		
		//추가할 뜻을 입력(공백을 입력하기 위해 line)
		System.out.print("제품 : ");
		String item = sc.nextLine();
		
		//단어장에 추가
		int result = note.insert(customer, item);
		
		switch(result) {
		case 1:System.out.println("단어 추가 성공!");break;
		case -1:System.out.println("의미 추가 성공!");break;
		case 0:System.out.println("단어 추가 실패!");break;
		}
		
	}
	private void insertItem() {
		//추가할 제품의 이름과 개수
		System.out.println("추가할 제품 : ");
		String item = sc.next();
		
		System.out.println("제품의 개수 : ");
		int itemNubmer = sc.nextInt();
	}
	private void updateItem() {
		
	}
	
	private void printSubMenuPrint() {

		System.out.println("==============");
		System.out.println("서브메뉴");
		System.out.println("==============");
		System.out.println("1. 제품 정보 조회");
		System.out.println("2. 제품 검색");
		System.out.print("서브 메뉴 선택 :");
	}
	private void updateWord() {
		//서브메뉴 출력
		printSubMenuPrint();
		//서브메뉴 입력
		int submenu = sc.nextInt();
		//서브메뉴에 따른 기능 실행
		switch(submenu) {
		//제품 정보 조회
		case 1:
			note.print();
			break;
		//제품 검색
		case 2:
			//검색할 단어
			System.out.println("검색 단어 : ");
			String title = sc.next();
			//출력
			note.search(title);
			break;
	
		}
	}
	
}




































