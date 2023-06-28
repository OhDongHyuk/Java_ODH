package day21.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(4);
		list.add(8);
		System.out.println(list);
		/* 리스트에 있는 sort는 compare 메소드를 가진 객체가 필요함.
		 * 왜냐하면 정렬기준을 compare로 하기 때문 compare 값이 음수이면 앞으로, 같으면 0
		 * 양수이면 뒤로.
		 * 객체가 compare 메소드를 반드시 갖게라기 위해 Comparator 인터페이스를 구현한
		 * 구현 클래스의 객체만 올 수 있게 지정 */
		//list.sort(new IntegerCompare());
		//Comparator 인터페이스에 익명 클래스를 만들어서 객체를 생성
		/*
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
			
		});//익명 클래스 사용(1회용)*/
		//list.sort(null); //이래도 정렬이 됨
		list.sort((Integer o1, Integer o2)->o1-o2);//람다식
		System.out.println(list);
	}

}
class IntegerCompare implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
	
}