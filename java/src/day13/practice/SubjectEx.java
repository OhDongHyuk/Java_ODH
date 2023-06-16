package day13.practice;

public class SubjectEx {

	public static void main(String[] args) {
		//Score pt1 = new Score("김남봉", 7, 88);
		//pt1.print();
		
		//Score pt2 = new Score("한삼식", 7, 89);
		//pt2.print();

		
		SubjectA sub1 = new SubjectA("kor");
		sub1.print();
		
		System.out.println("====================");
		
		SubjectA sub2 = new SubjectA("eng", 1, 1);
		sub2.updateScore(30, 40, 10);
		sub2.print();
	}

}
