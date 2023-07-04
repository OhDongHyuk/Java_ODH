package quiz;

public class Test10 {

	public static void main(String[] args) {
		PhoneNumber pn1 = new PhoneNumber("Hong", null);
		//기본생성자가 없어서 에러 발생. 생성자가 있기 때문에 기본 생성자가 자동으로 추가되지x
		PhoneNumber pn2 = new PhoneNumber(null, null);
	}

}

class PhoneNumber{
	private String name, number;
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = number;
	}
	//toString 메서드는 Object 클래스에서 상속을 받음.
	/*
	 public String toString(){
	 		return xxx;
	 }
	 */
	
	@Override
	//오버라이드 하려면 메서드 선언부가 같아야 함. 그런데 매개변수가 다름
	//@Override를 제거 => 메서드 오버로딩이 되기 때문에
	//매개변수를 제거
	public String toString() {//?
		return "이름 : " + name + ",번호 : " + number;
		
	}
}





























