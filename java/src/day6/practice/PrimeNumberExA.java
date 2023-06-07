package day6.practice;

public class PrimeNumberExA {

	public static void main(String[] args) {
		int i = 1, j, count;
		//i가 소수이면 i를 출력하는 코드
		
		while(++i <= 100) {
			j = 0;
			count = 0;
			while(++j <= i) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}

	}

}
