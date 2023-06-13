package day10.thisex;

public class StudentMain {

	public static void main(String[] args) {
		Student1.printCount();
		
		Student1 std1 = new Student1(1,1,1,"홍길동");
		Student1.printCount();		
		
		Student1 std2 = new Student1(1,1,1,"임꺽정"); //학생이 2명 = studentCount가 2가 되게끔 하고자 함
		Student1.printCount();
		
		//std2.studentCount = 1; 
		//System.out.println(Student1.studentCount); //static은 공유하기 때문에 1로 바뀜
		//System.out.println(std1.studentCount);//std1로 해도 1로 바뀌어 있음(static이기 때문)
		std1.print();
		//Student1.print(); //static이 안붙은 메소드는 객체를 통해 호출해야 함 //static이 print에는 안붙어서
		std2.print();
		System.out.println(std1); //둘이 객체가 다름
		System.out.println(std2);
	}

}
class Student1{ //A. public을 스킵한 이유는?
	private static int studentCount;//생성자를 제어해야함, private(외부에서 접근할 수 없도록)
	private int grade, classNum, number; //A. 클래스에서 왜 private을 써야하나?
	private String name;
	//아래 생성자는 매개변수가 있고, 매개변수의 이름이 멤버변수와 같기 때문에
	//멤버변수를 호출할 때 this를 반드시 붙여야함.
	public Student1(int grade, int classNum, int number, String name) {
		//this();
		this.grade = grade;//멤버변수 grade에 매개변수 grade를 저장
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;//생성자가 생성될 때 마다 증가
	}
	//기본 생성자 생성(기본 생성자는 매개변수가 없기 때문에 this를 안써도 됨)
	public Student1() {
		//멤버변수와 이름이 같은 지역변수를 만들수도 있다.(비추천)
		//int grade = 10;
		//this.grade = grade;
		
		//name = ""; //this 생성자 앞에 다른 코드가 나오면 안됨(순서 바꾸는건 가능)
		this(1,1,1,""); //this();와 서로 호출하여 무한루프 에러에 빠짐 재귀호출
		name = "";
		
		/*
		this.grade = 1;
		classNum = 1;
		number = 1;
		name = "";
		*/
	}
	
	public void print() {
		System.out.println("================");//이 새끼들의 정체는?
		System.out.println("grade : " + grade);//객체변수 사용 가능
		System.out.println("classNum : " + classNum);
		System.out.println("number : " + number);
		System.out.println("name : " + name);
		//클래스 변수 사용 가능
		//System.out.println("count : " + studentCount);
		//클래스 메소드 사용 가능
		//printCount();
	   
	}
	//클래스 메소드
	public static void printCount() {
		//클래스 변수 사용 가능
		System.out.println("Registered student count : " + studentCount);
		//객체변수 사용 불가능
		//grade = 1;
		//객체 메소드 사용 불가능
		//print();
		
		//객체를 생서 후 호출해서 사용 가능
		Student1 std1 = new Student1();
		std1.name = "Hong";
		std1.print();
		
	}
}