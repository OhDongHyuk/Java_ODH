package day13.homework.vo;

import day12.practice.Word;
import lombok.Data;

@Data
public class Voca2 {

	public class Word{
		//멤버 변수
		private String title;
		private String meaning[]; //배열을 여기서 지정
		private int meaningCount; //뜻이 저장된 개수
		//생성자
		public Word(String title, String meaning) {//뜻과 단어를 같이 추가할 경우
			this.title = title;
			this.meaning = new String[5]; //기본 5개
			this.meaning[0] = meaning;
			meaningCount++;
		}
		public Word(String title) {//단어만 추가할 경우
			this.title = title;
			this.meaning = new String[5]; //안써도 배열만 만들어주는게 좋음
		}
		//복사생성자
		public Word(Word w) {
			this.title = w.title;
			this.meaning = new String[5];
			for(int i = 0; i < w.meaningCount; i++) {
			    this.meaning[i] = w.meaning[i];
			}
			meaningCount = w.meaningCount;
		}
		//메소드
		/**단어와 뜻을 출력하는 메소드
		 * 매개변수 : 없음
		 * 리턴타입 : 없음 => void
		 * 메소드명 : print
		 */
		public void print() {
			System.out.println("word : " + title);
			System.out.println("meaning : ");
			for(int i = 0; i < meaningCount; i++) {//뜻은 여러개 이기 때문
				System.out.println(i+1 + ". " + meaning[i]);
			}
		}
		/**뜻을 추가하는 메소드
		 * 매개변수 : 추가 될 뜻 => String meaning
		 * 리턴타입 : String
		 * 메소드명 : addMeaning
		 */
		//내가 한거
		public String addMeaning(String meaning, int num) {
			this.meaning[num-1] = meaning;
			return null;
		}
		/**뜻을 추가하는 메소드
		 * 매개변수 : 추가 될 뜻 => String meaning
		 * 리턴타입 : void
		 * 메소드명 : addMeaning1
		 */
		//강사님이 한것
		public void addMeaning1(String meaning) {
			//뜻이 다 찼으면 다 찼다고 출력하고 종료
			if(meaningCount == this.meaning.length) {
				System.out.println("It's all filled.");
				return; //실행 안함
			}
			this.meaning[meaningCount] = meaning; //n번까지만 뜻을 채우는 방범
			meaningCount++;
		}
		/**뜻을 제거하고 제거여부를 알려주는 메소드
		 * 매개변수 : 제거할 뜻의 번호 => int num
		 * 리턴타입 : boolean
		 * 메소드명 : removeMeaning
		 */
		public boolean removeMeaning(int num) {
			if(num > meaningCount || num < 1) {
				//System.out.println("I can't work.");
				return false;
			}
			//num-1번지 부터 하나씩 당겨와서 덮어쓰기함.
			for(int i = num-1; i < meaningCount - 1; i++) {
				meaning[i] = meaning[i+1];
			}
			//당겨서 남은 마지막칸 지우기
			meaning[meaningCount-1] = null;
			//제거 됐으면 뜻 개수를 하나 줄임
			meaningCount--;
			return true;
		}
		/**수정할 뜻의 번지와 수정할 뜻이 주어지면 뜻을 수정하고 수정 여부를 알려주는 메소드
		 * 매개변수 : 수정할 뜻의 번지, 수정할 뜻 => int meaningNum, String meaning
		 * 리턴타입 : 수정 여부 => boolean
		 * 메소드명 : updateMeaning
		 * @param meaningNum
		 * @param meaning
		 * @return
		 */
		public boolean updateMeaning(int meaningNum, String meaning) {
			//수정할 뜻의 번호가 잘못된 경우
			if(meaningNum > meaningCount || meaningNum <= 0) {
				return false;
			}
			//meaningNum는 1부터이고 번지는 0부터이기 때문에 빼기 1을 한다
			this.meaning[meaningNum - 1] = meaning;
			return true;
		}
		
		//getter
		public String getTitle() {
			return title;
		}
		//setter
		public void setTitle(String title) {
			this.title = title;
		}
		 
	}
}























