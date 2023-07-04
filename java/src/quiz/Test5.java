package quiz;

import java.util.HashSet;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//Collection 인터페이스에 있는 메서드 : add, size
		//Collection 인터페이스의 자식으로 List와 Set이 있음
		set.add(1);
		set.add(2);
		/*
		for(int i = 0; i<set.size(); i++) {
			//get은 List에 있는 메서드. Set에는 없는 메서드
			System.out.println(set);
		}
		*/
		//Set은 향상된 for문 이나 Iterator 사용
		for(Integer tmp : set) {
			System.out.println(tmp);
		}
	}
}
