package day13.homework;

import day12.practice.Word;
import lombok.Data;

@Data
public class Voca {

	//멤버변수
	//단어들
	private Word wordList[];
	private int wordCount; //저장된 단어의 개수
		
	//생성자
	public Voca() {
		wordList = new Word[10];
	}
	
	public Voca(Word wordList[]) {
		//기존 단어장의 크기와 10을 비교해서 큰 수로 단어장 크기를 선택
		int size = wordList.length > 10 ? wordList.length : 10; 
		this.wordList = new Word[size];
		for(int i = 0; i < wordList.length; i++) {
			this.wordList[i] = new Word(wordList[i]);
		}
		wordCount = wordList.length;
	}
	//메소드
	/**단어들을 출력하는 메소드
	 * 매개변수 : 없다
	 * 리턴타입 : void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println("====================");
		for(int i = 0; i < wordCount; i++) {
			wordList[i].print();
			System.out.println("====================");
		}
	}
	//1
	/**단어가 주어지면 단어장에 추가하는 메소드(단어 객체를 넘겨주는 경우)
	 * 매개변수 : 단어(단어 객체) => Word word
	 * 리턴타입 : void
	 * 메소드명 : insert
	 */
	public void insert(Word word) {
		//단어장에 단어가 다 찼으면 추가를 하지 못함
		if(wordCount == wordList.length) {
			System.out.println("Vocabulary is full");
			return;
		}
		//깊은 복사를 위해 Word의 복사 생성자를 이용하여 새 단어를 생성한 후 추가
		wordList[wordCount++] = new Word(word); 
	}
	//2 + //6
	/**단어와 뜻이 주어지면 단어장에 추가하는 메소드(단어와 뜻을 넘겨주는 경우)
	 * 매개변수 : 단어와 뜻 => String title, String meaning 
	 * 리턴타입 : void
	 * 메소드명 : insert(메소드 오버로딩)
	 */
	public void insert(String title, String meaning) {
		//단어장에 단어가 다 찼으면 추가를 하지 못함
		if(wordCount == wordList.length) {
			System.out.println("Vocabulary is full");
			return;
		}
		int index = indexOf(title);
		//없는 단어이면 새 단어로 추가
		if(index == -1) {
		//단어와 뜻을 이용해 단어 객체를 생성한 후 단어장에 추가
			wordList[wordCount++] = new Word(title, meaning); 
			return;
		}
		//있는 단어이면 뜻을 추가
		wordList[index].addMeaning1(meaning);
		
	}
	//3
	/**단어장에서 단어를 삭제하는 메소드
	 * 매개변수 : 삭제할 단어 => String title
	 * 리턴타입 : void
	 * 메소드명 : delete
	 */
	public void delete(String title) {
		//단어가 어디있는지 찾아야 함
		int index = indexOf(title);
		
		//단어가 단어장에 없으면 알림 메세지 출력 후 종료
		if(index == -1) {
			System.out.println("No words found");
			return;
		}
		//찾은 위치부터 한칸씩 밀어줌
		for(int i = index; i < wordCount-1; i++) {
			wordList[i] = wordList[i+1];
		}
		//단어의 개수를 하나 줄여줌
		wordCount--;
		//마지만 단어를 비워둠(null)
		wordList[wordCount] = null;
	}
	//4
	/**단어가 주어지면 단어가 있는 위치를 알려주는 메소드
	 * 단어가 없으면 -1 (배열의 번지는 0부터 이기 때문에 음수로 리턴)
	 * 매개변수 : 단어 => String title
	 * 리턴타입 : 위치 => 번지 => 정수 => int
	 * 메소드명 :indexOf
	 */
	public int indexOf(String title) {
		//단어장에 등록된 단어들을 조회
		for(int i = 0; i < wordCount; i++) {
			//단어가 같으면 i번지를 리턴
			if(wordList[i].getTitle().equals(title)) {
				return i;
			}
		}
		//일치하는 단어가 없는 경우이므로 -1을 리턴
		return -1;
	}
	//5
	/**단어가 주어지면 단어장에 해당 단어를 출력하는 메소드
	 * 매개변수 : 단어 => String title
	 * 리턴타입 : void
	 * 메소드명 : search
	 */
	public void search(String title) {
		int index = indexOf(title);
		
		if(index == -1) {
			System.out.println("No words found");
			return;
		}
		
		wordList[index].print();
	}
	//7 -> 이해 안됨
	/**단어와 수정할 뜻의 번호와 수정할 뜻이 주어지면 단어의 뜻을 수정하는 메소드
	 * 매개변수 : 단어, 수정할 뜻의 번호, 수정할 뜻
	 * 			=>String title, int meaningIndex, String meaning
	 * 리턴타입 : void
	 * 메소드명 : updateMeaning
	 */
	public void updateMeaning(String title, int meaningIndex, String meaning) {
		//어느 부분에서 단어가 수정되는지 모르겠음
		int index = indexOf(title);
		if(index == -1) {
			System.out.println("No words found");
			return;
		}
		//뜻이 없는 칸의 숫자를 입력했을때
		if(!wordList[index].updateMeaning(meaningIndex, meaning)) {
			System.out.println("Wrong number");
		}
	}

	//8
	/**단어와 수정할 단어가 주어지면 단어를 수정하는 메소드
	 * 매개변수 : 단어와 수정할 단어가 => String title, String updateTitle
	 * 리턴타입 : void
	 * 메소드명 : updateTitle
	 */
	public void updateTitle(String title, String updateTitle) {
		int index = indexOf(title);
			
		if(index == -1) {
			System.out.println("No words found");
			return;
		}
		wordList[index].setTitle(updateTitle);
	}
	
	//9
	/**단어와 삭제할 뜻의 번호가 주어지면 뜻을 삭제하는 메소드
	 * 매개변수 : 단어, 삭제할 뜻의 번호
	 * 			=>String title, int meaningIndex
	 * 리턴타입 : void
	 * 메소드명 : deleteMeaning
	 */
	public void deleteMeaning(String title, int meaningIndex) {
		int index = indexOf(title);
		if(index == -1) {
			System.out.println("No words found");
			return;
		}
		wordList[index].removeMeaning(meaningIndex);
	}
}






