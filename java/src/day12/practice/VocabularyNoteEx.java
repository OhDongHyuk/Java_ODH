package day12.practice;

public class VocabularyNoteEx {

	public static void main(String[] args) {
		// 영어 단어장을 만들기 위해 필요한 객체를 만들고 테스트 해보세요.
		Voca vo1 = new Voca("apple");
		vo1.print();
	}

}
class Voca {
	private static int vocaNum;
	private String voca;
	public Voca(String voca) {
		this.voca = voca;
		vocaNum++;
	}
	public String getVoca() {
		return voca;
	}
	public void setVoca(String voca) {
		this.voca = voca;
	}
	public void print() {
		System.out.println(voca);
	}
	
	
}