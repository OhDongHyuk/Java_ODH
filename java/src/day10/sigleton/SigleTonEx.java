package day10.sigleton;

public class SigleTonEx {

	public static void main(String[] args) {
		//SamsungCompany company = new SamsungCompany();
		
		SamsungCompany company1 = SamsungCompany.getInstance();
		SamsungCompany company2 = SamsungCompany.getInstance();
		System.out.println(company1); //day10.sigleton.SamsungCompany@2ff4acd0
		System.out.println(company2); //day10.sigleton.SamsungCompany@2ff4acd0 맨 뒤가 같다는 건 같은 객체를 공유한다는 것

	}

}

class SamsungCompany{
	
	private static SamsungCompany company = new SamsungCompany(); //나 자신을 내가 클래스 변수로 가지고 있고 받자마자 호출
	
	private String name;
	private String address;
	
	//public SamsungCompany() {} //일반적으로 생성자는 이렇게 만들지만
	
	private SamsungCompany() { //이렇게 하면 new연산자 사용 불가능
		name = "Samsung";
		address = "Korea";
	}
	public static SamsungCompany getInstance() {
		return company;
	}
	
}