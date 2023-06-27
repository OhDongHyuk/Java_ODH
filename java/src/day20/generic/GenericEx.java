package day20.generic;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericEx {

	public static void main(String[] args) {
		Student<Integer> std = new Student<Integer>(); //<T>에 대응하는 <클래스>를 사용해야 함
		std.kor = 10;//Wrapper클래스가 Integer임으로 정수 //10.0을 넣으면 에러 발생
		
		Student<Double> std2 = new Student<Double>();
		std2.kor = 10.0;
		ArrayList<String> list;//<>가 있으면 제네릭 클래스
		
		//Student<Scanner> std3 = new Student<Scanner>();
		//std3.kor = 10;//숫자와 전혀 상관 없는 클래스가 쓰일 수 있음
		//그래서 제네릭 클래스를 제한해 줌
		
		print(std2);//앞에 GenericEx가 같은 클래스 안이라 생략되어 있음
		GenericEx.<Double>print(std2);
		GenericEx.print(std2);//std2가 Double로 되어 있어서 print의 T가 Double이라고 추정할 수 있음
	}
	//학생 정보를 출력하는 메소드
	public static <T extends Number> void print(Student<T> std) {
		System.out.println(std.grade);
		System.out.println(std.classNum);
		System.out.println(std.num);
		System.out.println(std.kor);
	}
}

















































