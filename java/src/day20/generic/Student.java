package day20.generic;

public class Student<T extends Number> {//<T, K> 처럼 여러개가 올 수 있다.
	int grade, classNum, num;           //<T extends Number> Number 클래스를 상속받은 클래스들만 올 수 있다.(Integer, Double)
	String name;
	public T kor, math, eng;
}
