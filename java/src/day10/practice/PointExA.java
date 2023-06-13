package day10.practice;

public class PointExA {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.print();
		pt1.move(10, 20);
		pt1.print();
		
		Point pt2 = new Point(30,40);
		pt2.print();

	}

}
//점을 관리하는 클래스
/* 클래스의 접근제어자가 public으로 올 수 있는 조건 
 * -파일명과 클래스명이 같아야 public을 붙일 수 있음 //왜?
 * 같은 패키지에 같은 이름의 클래스가 있으면 안됨
 * */
class Point{
	//맴버변수
	/* x좌표, y좌표 */
	private int x, y;
	
	//생성자
	public Point() {}//리턴타입이 없고 void 안씀(생성자 특징), 0으로 넣을거면 굳이 입력 안해도됨 int 초기값이 0이기 때문
	//생성자 오버로딩. x,y좌표가 주어졌을 때 객체를 초기화
	public Point(int x, int y) { //좌표를 생성했을때 좌표를 생성해주는 생성자, 생성자 앞은 public(private을 쓸 일은 거의 없음)
		this.x = x;
		this.y = y;
	}

	//getter와 setter(메소드에 포함)
	
	/* getter
	 *  public 리턴타입 get변수명(){
	 *     return 변수명;       
	 * }
	 * get변수명에서 변수명의 첫 글자를 대문자
	 * 리턴타입은 변수의 자료형
	 * 
	 * setter
	 * public void set변수명(자료형 변수명){ //void 고정
	 *     this.변수명 = 변수명;
	 * }
	 * */ //get set의 역할은?
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메소드
	/**현재 좌표를 출력하는 기능
	 * 매개변수 : 없음 //내 정보를 활용한다 => 멤버변수 활용, 내 정보가 아닌 외부 정보를 활용 => 매개변수
	 * 리턴타입 : 없음 => void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println("" + x + "," + y + "px");
	}
	/**주어진 x,y좌표로 이동하는 메소드
	 *  =>맴버변수 x,y를 주어진 x,y로 수정하는 메소드
	 * 매개변수 : 주어진 x,y => int x, int y
	 * 리턴타입 : 없음 => void (멤버변수만 바꾸는 경우)
	 * 메소드명 : move
	 */
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
