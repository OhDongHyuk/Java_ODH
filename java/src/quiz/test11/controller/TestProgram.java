package quiz.test11.controller;

public class TestProgram implements Program{
	
	int num;
	
	public void print() {
		System.out.println(num);
	}
	
	//Program 인터페이스를 구현한 클래스이기 때문에 인터페이스에 있는 추상메서드를 반드시 오버라이딩 해야 함
	public void run() {
		
	}
}
