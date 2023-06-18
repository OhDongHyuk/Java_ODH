package day13.homework;

import java.util.Scanner;

import day12.practice.Word;

public class VocabularyNoteEx {

	public static void main(String[] args) {
		int i = 0;
		char j;
        Word wordList[] = {};
        
        Voca note = new Voca(wordList);
        Voca2 mote = new Voca2();
        Scanner sc = new Scanner(System.in);
        
		do {
			System.out.println("메뉴");
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 삭제");
			System.out.println("3. 단어 수정");
			System.out.println("   " + "a. 단어 수정");
			System.out.println("   " + "b. 뜻 수정");
			System.out.println("   " + "c. 뜻 삭제");
			System.out.println("4. 단어 출력");
			System.out.println("   " + "a. 전체 출력");
			System.out.println("   " + "b. 검색");
			System.out.println("5. 프로그램 종료");
			i = sc.nextInt();
			
			switch(i) {
			case 1:
				System.out.println("추가할 단어와 뜻을 입력해 주세요 : ");
				String a = sc.next();
				String b = sc.next();
				Word word = new Word(a,b);
		        note.insert(word);
		        note.print();
		        break;

			case 2:
				System.out.println("삭제할 단어를 입력해 주세요 : ");
				String c = sc.next();
				note.delete(c);
				note.print();
				break;
				
			case 3:
				System.out.println("수정할 메뉴를 골라주세요 : ");
				System.out.println("a. 단어 수정");
				System.out.println("b. 뜻 수정");
				System.out.println("c. 뜻 삭제");
				j = sc.next().charAt(0);
				if(j == 'a') {
					System.out.println("원래 단어와 수정할 단어와 입력해 주세요 : ");
					String d = sc.next();
					String e = sc.next();
					note.updateTitle(d,e);
					note.print();
				}else if(j == 'b') {
					System.out.println("수정할 뜻의 단어와 번호와 수정할 내용을 입력해 주세요 : ");
					String d = sc.next();
					int e = sc.nextInt();
					String f = sc.next();
					note.updateMeaning(d, e, f);
					note.print();
				}else if(j == 'c') {
					System.out.println("뜻을 삭제할 단어와 삭제할 뜻의 번호를 입혁해 주세요 :");
					String d = sc.next();
					int e = sc.nextInt();
					note.deleteMeaning(d,e);
					note.print();
				}
				break;
				
			case 4:
				System.out.println("출력할 메뉴를 골라주세요 : ");
				System.out.println("a. 전체 출력");
				System.out.println("b. 검색");
				j = sc.next().charAt(0);
				if(j == 'a') {
					note.print();
				}
				if(j == 'b') {
					System.out.println("검색할 단어를 입력해 주세요 : ");
					String d = sc.next();
					note.search(d);
				}
				
				break;
				
			default:
				System.out.println("Wrong number!");
				System.out.println("");
				
			}
			
		}while(i != 5);
		
		
		sc.close();

	}

}




