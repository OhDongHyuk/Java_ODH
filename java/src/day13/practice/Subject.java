package day13.practice;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Score{
	//멤버변수
	private String name;
	private int num;
	private int score;
	
	//생성자
	public Score(String name, int num, int score){
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
	//메소드
	/** 학생의 이름, 번호, 점수를 출력하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println("================");
		System.out.println("Name : " + name);
		System.out.println("Num : " + num);
		System.out.println("Score : " + score);
	}
	
}
























