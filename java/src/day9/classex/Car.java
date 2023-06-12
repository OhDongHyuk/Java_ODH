package day9.classex;

public class Car {
	//멤버 변수(필드)
	private String name;       //차명
	private String company;    //제조사
	private int year;          //연식
	private int speed;         //속력
	private char gear;         //P: 주차 R: 후진 D: 주행 N: 중립
	private boolean power;     //전원
	
	//생성자
	public Car(String _name, String _company, int _year) {
		name = _name;
		company = _company;
		year = _year;
		gear = 'P';
	}
	
	//메소드
	/**자동차 정보를 출력하는 메소드
	 * 매개변수 : 없음 //이미 정보를 가지고 있음
	 * 리턴타입 : 없음 => void
	 * 메소드명 : printInfo
	 */
	public void printInfo() {
		System.out.println("VIEW");
		System.out.println("Company : " + company);
		System.out.println("Model   : " + name);
		System.out.println("Year    : " + year);
		System.out.println("Power   : " + (power?"On":"Off"));
		System.out.println("Gear    : " + gear);
		System.out.println("Speed   : " + speed);
	}
	/**속력이 1 증가/감소하는 메소드
	 * 매개변수 : 증가할건지 감소할건지 => boolean positive
	 * 리턴타입 : 없음 => void
	 * 메소드명 : speedChange
	 */
	public void speedChange(boolean positive) {
		//전원이 꺼져있으면 종료
		if(!power) {
			return;
		}
		//기어가 중립 또는 주차중이면 종료
		if(gear == 'N' || gear == 'p') {
			return;
		}
		//속력이 증가하는 경우이면 
		if(positive) {
			speed += 1;
		}
		//속력이 감소하는 경우이고 속력이 0보다 크다면
		else if(speed > 0) {
			speed -= 1;
		}
	}
	/**자동차 시공을 켜거나 끄는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 => void
	 * 메소드명 : turn
	 */
	public void turn() {
		//시동이 꺼져 있으면 켬
		if(!power) {
			power = true;
		}else if(gear == 'p') {
			power = false;
		}
	}
	public void setGear(char _gear) {
		gear = _gear;
	}
	
}


