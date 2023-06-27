package day20.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//1부터 5까지 차례대로 추가하는 코드
		for(int i = 1; i <= 5; i++) {
			list.add(i);//정수 i가 박싱으로 Integer 클래스의 객체가 된 후 list에 추가 
		}
		//1을 더 추가
		list.add(1);//list는 중복을 허용하기 때문에 추가 가능
		System.out.println(list);
		//1을 제거 //1은 첫번째 만나는 1을 제거하고 제거가 되어서 true를 반환
		list.remove((Integer)1);//1을 제거하는게 아니라 1번지를 제거하는것 그래서 2가 지워짐 그래서 따로 (Integer)를 붙여줘야함
		System.out.println(list);
		//1번지에 있는 값을 제거(3을 제거)
		Integer num = list.remove(1);//1번지에 있는 요소를 제거하고 제거한 요소를 반환
		System.out.println(num);
		System.out.println(list);
		System.out.println(list.size());//size = 저장된 객체의 수를 출력, 저장 가능한 최대 객체 수가 아님.
		
		//일반 //리스트는 특정 번지에 접근할 수 있어서 get()을 이용하여 반복문을 활용할 수 있음
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) +  " ");
		}
		System.out.println();
		
		//향상된 for문 //List와 Set 모두 가능
		for(int tmp : list) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		//Iterator
		Iterator <Integer> it = list.iterator();
		while(it.hasNext()) {//hasNext : 다음 요소가 있는지 없는지(내 뒤에 있냐 없냐)
			Integer tmp = it.next();
			System.out.println(tmp + " ");
		}
		System.out.println();
		
		System.out.println(list.contains(1));//List에 1이 있는지 없는지 확인
		System.out.println(list.indexOf(1));//List에 1이 몇 번지에 있는지
	}

}

































