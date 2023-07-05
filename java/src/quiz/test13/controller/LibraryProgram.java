package quiz.test13.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import quiz.test13.vo.Book2;
import quiz.test13.vo.BookRentalList;

public class LibraryProgram implements Program {
	
	private Scanner sc = new Scanner(System.in);
	private static final int EXIT = 4;
	private List<Book2> list = new ArrayList<>();
	private List<BookRentalList> rentalList = new ArrayList<>();
	
	@Override
	public void run() {
		int menu;
		String fileName = "src/quiz/test13/book.txt";
		String rentalFileName = "src/quiz/test13/rentalBook.txt";
		load(fileName);
		rentalLoad(rentalFileName);
		do {
			System.out.println(list);
			System.out.println(rentalList);
			//메뉴 출력
			printMenu();
			//메뉴 선택(메뉴를 입력 받음) : Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		save(fileName);
		rentalSave(rentalFileName);
		sc.close();
	}
	
	private void rentalSave(String rentalFileName) {
		try(FileOutputStream fos = new FileOutputStream(rentalFileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(BookRentalList tmp : rentalList) {
					oos.writeObject(tmp); //학생정보를 하나씩 찍어주기
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void rentalLoad(String rentalFileName) {
		try(ObjectInputStream ois 
			= new ObjectInputStream(new FileInputStream(rentalFileName))){
			while(true) {
				BookRentalList tmp = (BookRentalList)ois.readObject();
				rentalList.add(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.");
		} catch (EOFException e) {//end of file
			System.out.println("불러오기 완료.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectInputStream을 이용하여 객체단위로 읽어올 때 클래스가 Serializable 인터페이스를 구현하기 않으면 발생
			System.out.println("Student 클래스를 찾을 수가 없습니다.");
		} 
			
		
	}

	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 대출");
		System.out.println("3. 도서 반납");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
		
	}
	
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBook();
			break;
		case 2:
			bookRental();
			break;
		case 3:
			bookReturn();
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
		}
		
	}
	private void bookReturn() {
		System.out.println(rentalList);
		
		sc.nextLine();
		System.out.print("반납할 책 제목을 입력해 주세요 : ");
		final String bookName = sc.nextLine();
		System.out.print("반납할 저자의 이름을 입력해 주세요 : ");
		final String bookWriter = sc.nextLine();
		System.out.print("반납할 책의 isbn 번호를 입력해 주세요 : ");
		final String bookIsbn = sc.nextLine();
		System.out.print("반납할 책의 번호를 입력해 주세요 : ");
		final String bookNum = sc.nextLine();
	
		Book2 book = new Book2(bookName, bookWriter, bookIsbn, bookNum);
		BookRentalList rentalBook = new BookRentalList(book, null, 0);
		
		if(rentalList.contains(rentalBook)) {
			list.add(book);
			rentalList.remove(rentalBook);
			System.out.println("반납이 완료 되었습니다.");
			return;
		}
		System.out.println("등록되지 않은 책 입니다.");
		
	}

	private void bookRental() {
		sc.nextLine();
		System.out.print("대출할 책의 번호를 입력해 주세요 : ");
		String bookNum = sc.nextLine();
			
		int index = list.indexOf(new Book2(null,null,null,bookNum));
		
		
		if(index != -1 ) {
			Date loanDate = new Date();
			BookRentalList lb 
			= new BookRentalList(list.get(index), loanDate, 14);
			rentalList.add(lb);
			list.get(index).loanBook();
			
			System.out.println("대출일 : " + lb.getLoanDateStr());
			System.out.println("대출이 완료 되었습니다.");
			return;
		}
		System.out.println("대출되었거나 등록되지 않은 책 입니다.");
		
		
	}

	private void insertBook() {
		sc.nextLine();
		System.out.print("등록할 책 제목을 입력해 주세요 : ");
		String bookName = sc.nextLine();
		System.out.print("등록할 저자의 이름을 입력해 주세요 : ");
		String bookWriter = sc.nextLine();
		System.out.print("등록할 책의 isbn 번호를 입력해 주세요 : ");
		String bookIsbn = sc.nextLine();
		System.out.print("등록할 책의 번호를 입력해 주세요 : ");
		String bookNum = sc.nextLine();
		
		Book2 book = new Book2(bookName, bookWriter, bookIsbn, bookNum);
		BookRentalList rentalBook = new BookRentalList(book, null, 0);
		
		if(!list.contains(book) && !rentalList.contains(rentalBook)) {
			list.add(book);
			System.out.println("신규 책 등록이 완료 되었습니다.");
			return;
		}
		System.out.println("신규 책 등록에 실패 했습니다.");
		
		
	}

	@Override
	public void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(Book2 tmp : list) {
					oos.writeObject(tmp); //학생정보를 하나씩 찍어주기
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(String fileName) {
		try(ObjectInputStream ois 
			= new ObjectInputStream(new FileInputStream(fileName))){
			while(true) {
				Book2 tmp = (Book2)ois.readObject();
				list.add(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.");
		} catch (EOFException e) {//end of file
			System.out.println("불러오기 완료.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectInputStream을 이용하여 객체단위로 읽어올 때 클래스가 Serializable 인터페이스를 구현하기 않으면 발생
			System.out.println("Student 클래스를 찾을 수가 없습니다.");
		} 
		
	}


}
