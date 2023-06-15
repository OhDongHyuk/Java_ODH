package day12.practice;

/* 단어장 클래스
 * - 단어들의 모임
 * - Word들의 모임
 * 
 */

public class VocabularyNote1 {

	//멤버변수
	//단어들
	private Word wordList[];
	private int wordCount; //저장된 단어의 개수
		
	//생성자
	public VocabularyNote1() {
		wordList = new Word[10];
	}
	
	public VocabularyNote1(Word wordList[]) {
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
	/**단어가 주어지면 단어장에 추가하는 메소드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */
	
	/**단어장에서 단어를 삭제하는 메소드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */
	
	/**단어가 주어지면 단어장에 해당 단어를 출력하는 메소드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */

	/**단어와 뜻이 주어지면 없는 당어이면 새로 단어이면 새로 단어를 추가하고,
	 * 있는 당어이면 뜻만 새로 추가하는 메소드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */
	
	/**단어와 수정할 뜻의 번호와 수정할 뜻이 주어지면 단어의 뜻을 수정하는 메소드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */
	
	/**단어와 수정할 단어가 주어지면 단어를 수정하는 메소드
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */
}
