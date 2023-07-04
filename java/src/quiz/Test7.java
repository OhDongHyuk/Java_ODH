package quiz;

public class Test7 {

	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10.4,12.2));
	}
	//메서드 오버로딩 : 메서드명이 같고 매개변수가 다를 때
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//이미 sum(정수, 정수)가 있기 때문에 아래 메서드는 오버로딩 될 수 없음.
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}
