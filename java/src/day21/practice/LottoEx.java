package day21.practice;

import java.util.HashSet;
import java.util.Scanner;

import array.Array;

public class LottoEx {

	public static void main(String[] args) {
		//랜덤으로 로또번호 6개와 보너스 번호 1개를 생성
		//7개짜리 배열에 로또번호를 생성하고, 앞에 6개는 로또 번호 마지막 한개는 보너스로 활용
		int bonus;
		HashSet<Integer> lotto = new HashSet<>();
		HashSet<Integer> user = new HashSet<>();
		int min = 1, max = 45;
		
		//로또 번호를 랜덤으로 생성(1~45)
		while(lotto.size() < 6) {
			int r = random(min, max);
			lotto.add(r);
		}
		System.out.println(lotto);
		//보너스 번호 생성
		do {
			bonus = random(min, max);
		}while(lotto.contains(bonus));
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("input 6 numbers : ");
		while(user.size() < 6) {
			user.add(sc.nextInt());
		}
		sc.close();
		
		//등수 체크
		//일치하는 개수
		int count = 0;
		for(Integer tmp : user) {
			if(lotto.contains(tmp)) {
				count++;
			}
		}
		//개수를 이용하여 등수 체크
		switch(count) {
		case 6: System.out.println("Rank 1"); break;
		case 5: 
			if(user.contains(bonus)) {
				System.out.println("Rank 2");
			}else {
				System.out.println("Rank 3");
			}
			break;
		case 4: System.out.println("Rank 4"); break;
		case 3: System.out.println("Rank 5"); break;
		default : System.out.println("Failed");
		}
		
		sc.close();
	}

	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
}
















