package day28.baseball.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BaseballGame {
	private List<Integer> com;
	private List<Integer> user;
	
	public BaseballGame() {
		com = new ArrayList<>();
		user = new ArrayList<>();
		generate (3, 1 ,9);
	}
	
	//컴퓨터가 중복되지 않는 1~9사이의 랜덤한 값 3개를 생성하는 메서드
	public boolean generate(int size, int min, int max) {
		if(size <= 0) {
			return false;
		}
		if(max < min) {
			return false;
			}
		if(max - min + 1 < size) {
			return false;
		}
		if((max - min + 1) < size) { 
		Random random = new Random();
		Set<Integer> set = new HashSet<>();
		//랜덤한 수를 size개 만큼 set에 추가
		while(set.size() < size) {
			set.add(random.nextInt(max - min + 1) + min);
		    }
		}
		//중복되지 않고 처리괸 set을 List에 지정
	    com.addAll(set);
	    com.addAll(set);
	    Collections.bu
	}
}
