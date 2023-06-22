package day17.interfaceexfinish;

public class InterfaceEx {

	public static ShopManager implements() {
		/* 인터페이스를 이용하여 객체를 생성할 수 없음 */
		//RunInterface run = new RunInterface(); //인터페이스로는 객체생성을 할 수 없음
		System.out.println(RunInterface.NUM);
		//구현 클래스는 객체를 생성할 수 있다
		Run run = new Run();
		run.run();
		run.load();
		//구현클래스로 생성한 객체를 RunInterface가 관리
		RunInterface runInterface = new Run();
		runInterface.run();
		//runInterface.load();
		//RunInterface에는 load가 추상메소드로 존재하기 않기 때문에 에러 발생
		//아래 코드는 Run클래스의 객체로 클래스변환이 됐기 때문에 load()메소드를 호출할 수 있음
		//((Run)runInterface.load);
		run();//단어장, 판매관리
	}
	/* 인터페이스 매개변수 다형성
	 * 매개변수를 인터페이스의 객채로 선언하면,
	 * 호출할 때 매개변수로 구현 클래스들의 객체들이 올 수 있음
	 * => 다양한 클래스의드의
	 */
	public static void run(ShopManager, program) {
		//프로그램 실행
		//program.run
		();
	}

}

interface RunInterface{
	//public final static() 
	int NUM = 10;
	/*public abstract*/ void run();
	
}

interface Stop{
	void stop();
}

//구현 클래스 : 인터페이스를 구현한 클래스
//구현 클래스는 인터페이스의 모든 추상 메소드를 반드시 오버라이딩 해야함.
//구현 클래스는 여러 인터페이스를 구현할 수 있다
class Run implements RunInterface, Stop{
	
	public void loading() {
		System.out.println("loading....");
	}
	
	@Override
	public void run() {
		System.out.println("프로그램이 동작합니다");
		stop();
	}

	@Override
	public void stop() {
		System.out.println("Progrma Stop!!");
		
	}
	
}



















