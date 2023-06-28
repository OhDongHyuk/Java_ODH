package day21.practice.updown.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import day21.practice.updown.vo.RecordGame;

public class UpDownController implements Program {
	
		private final static int EXIT = 3;
		private HashSet<Integer> game = new HashSet<>();
		private HashSet<Integer> user = new HashSet<>();
		private Scanner sc = new Scanner(System.in);
		private HashMap<String, Integer> map = new HashMap<>();
		int min = 1, max = 100, num, count, i;
		String id;
		//기록을 저장하는 리스트
		private ArrayList<RecordGame> list = new ArrayList<>();
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
		public void printMenu() {
			System.out.println("Menu : ");
			System.out.println("1. play");
			System.out.println("2. record");
			System.out.println("3. exit");
			System.out.print("select : ");
			
		}
	
		@Override
		public void runMenu(int Menu) {
			switch(Menu) {
			case 1:
				playGame();
				break;
			case 2:
				recordGame();
				break;
			case 3:
				System.out.println("Program Exit");
				break;
			default:
			}
		}

		private void recordGame() {
			for(RecordGame tmp : list) {
				System.out.println(tmp);
			}
			
		}

		private void playGame() {
			
			int r = (int)(Math.random()*(max - min + 1) + min);
			count = 0;
			
			while(r != num) {
								System.out.print("Input number : ");
				num = sc.nextInt();
				
				if(num > r) {
					System.out.println("Down!");
				}else if(num < r) {
					System.out.println("Up!");
				}else {
					System.out.println("Good!");
				}
				count++;
			}
			System.out.print("Insert Id :");
			id = sc.next();
			
			RecordGame rec = new RecordGame(id, count);
			list.add(rec);
			//sort();
			list.sort(new Comparator<RecordGame>() {

				@Override
				public int compare(RecordGame o1, RecordGame o2) {
					return o1.getCount() - o2.getCount();
				}
			});
					
			
		}
		
		
		private void sort() {
			for(int i = 0; i < list.size() - 1; i++) {
				for(int j = 0; j < list.size() - 1; j++) {
					if(list.get(j).getCount() > list.get(i).getCount()) {
						RecordGame tmp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, tmp);
					}
				}
			}
		}
}

















