package quiz;

public class Test6 {

	public static void main(String[] args) {
		//평균 예제
		int kor = 100, eng = 90, math = 34;
		//에러가 발생. 실수를 정수형 변수에 저장하려고 했기 때문에(자동으로 형변환X)
		//int를 double
		double avg = (kor + eng + math)/3.0;
		System.out.println("평균 : " + avg);

	}

}
